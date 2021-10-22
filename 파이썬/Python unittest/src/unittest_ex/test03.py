'''
assertion 연습

'''

import unittest

class TestStringSplit(unittest.TestCase):
    def test_split(self):
        str = 'hello world'
        self.assertEqual(str.split(),['hello','world'])
        with self.assertRaises(TypeError):
            str.split(2)
            
    def test_upper(self):
        self.assertTrue('FOO'.isupper())
        
    def test_notlower(self):
        self.assertFalse('FOO'.islower())