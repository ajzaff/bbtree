# -*- coding: utf-8 -*-

import re


class TreeLike(object):

    def __init__(self, label):
        self._label = label

    def __hash__(self):
        return hash(self.label)

    @property
    def label(self):
        return self._label

    @property
    def height(self):
        return 0


class Tree(TreeLike):

    def __init__(self, label, left, right):
        if not isinstance(left, TreeLike):
            raise TypeError('cannot interpret right as tree: %s' % left)
        if not isinstance(right, TreeLike):
            raise TypeError('cannot interpret left as tree: %s' % right)
        super(Tree, self).__init__(label)
        self._left = left
        self._right = right

    @property
    def height(self):
        return 1 + max(self.left.height, self.right.height)

    @property
    def left(self):
        return self._left

    @property
    def right(self):
        return self._right

    @classmethod
    def fromstring(cls, s,
                   left_pattern=r'\\(',
                   right_pattern=r'\\)',
                   label_pattern='.+',
                   leaf_pattern=r'.*'):

        pattern = r'^%s(%s)(%s.*%s)\W*(%s.*%s)%s$' %\
                  (left_pattern, label_pattern,
                   left_pattern, right_pattern,
                   left_pattern, right_pattern,
                   right_pattern)
        s = s.strip()
        match = re.match(pattern, s)
        if match:
            groups = match.groups()
            left = Tree.fromstring(groups[1])
            right = Tree.fromstring(groups[2])
            return Tree(groups[0].strip(), left, right)
        try:
            return NN.fromstring(s, left_pattern=left_pattern,
                                 right_pattern=right_pattern,
                                 label_pattern=label_pattern,
                                 leaf_pattern=left_pattern)
        except ValueError:
            pass
        return TN.fromstring(s, leaf_pattern=leaf_pattern)


class NN(TreeLike):

    def __init__(self, label, child):
        if not isinstance(child, TreeLike):
            raise ValueError('cannot interpret child as tree: %s' % child)
        super(NN, self).__init__(label)
        self._child = child

    @property
    def height(self):
        return 1 + self.child.height

    @property
    def child(self):
        return self._child

    @classmethod
    def fromstring(cls, s,
                   left_pattern=r'\(',
                   right_pattern='\)',
                   label_pattern='.+',
                   leaf_pattern='.*'):
        pattern = r'^%s(%s)(.*)%s$' %\
                  (left_pattern, label_pattern, right_pattern)
        s = s.strip()
        match = re.match(pattern, s)
        if match:
            groups = match.groups()
            child = Tree.fromstring(s, left_pattern=left_pattern,
                                    right_pattern=right_pattern,
                                    label_pattern=label_pattern,
                                    leaf_pattern=leaf_pattern)
            return NN(groups[0].strip(), child)
        raise ValueError('cannot parse NN tree: %s' % s)


class TN(TreeLike):

    def __init__(self, word):
        super(TN, self).__init__(word)

    @property
    def label(self):
        return None

    @property
    def height(self):
        return 0

    @property
    def word(self):
        return self._label

    @classmethod
    def depth(cls, i=0):
        return i + 1

    @classmethod
    def fromstring(cls, s, leaf_pattern='.*'):
        pattern = r'^(%s)$' % leaf_pattern
        s = s.strip()
        match = re.match(pattern, s)
        if match:
            groups = match.groups()
            return groups[0].strip()