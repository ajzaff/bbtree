# -*- coding: utf-8 -*-

from bbtree import tree
import unittest


class TestTreeLike(unittest.TestCase):

    def testInit(self):
        tree.TreeLike('XP')

    def testLabel(self):
        t = tree.TreeLike('XP')
        self.assertEqual(t.label, 'XP')

    def testHeight(self):
        t = tree.TreeLike('XP')
        self.assertEqual(t.height, 0)

    def testHash(self):
        t = tree.TreeLike('XP')
        self.assertEqual(hash(t), hash('XP'))


class TestTree(unittest.TestCase):

    def testInit(self):
        tree.Tree('XP', tree.TN('x'), tree.TN('y'))

    def testInitNoLeftExpectValueError(self):
        with self.assertRaises(TypeError):
            tree.Tree('XP', 3, tree.TN(''))

    def testInitNoRightExpectValueError(self):
        with self.assertRaises(TypeError):
            tree.Tree('XP', tree.TN(''), 3)


class TestNN(unittest.TestCase):

    def testInit(self):
        tree.NN('XP', tree.NN('X', tree.TN('x')))

    def testLabel(self):
        t = tree.TreeLike('XP')
        self.assertEqual(t.label, 'XP')

    def testHeight(self):
        t = tree.TreeLike('XP')
        self.assertEqual(t.height, 0)

    def testHash(self):
        t = tree.TreeLike('XP')
        self.assertEqual(hash(t), hash('XP'))


class TestTN(unittest.TestCase):

    pass