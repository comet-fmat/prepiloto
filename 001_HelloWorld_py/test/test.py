#!/usr/bin/env python2
import unittest
import sys
import StringIO
from tmc import points
sys.path.append('../')
from src.main import hello_world


@points('1.0')
class MainTest(unittest.TestCase):
    __qualname__ = "MainTest"

    def test_helloWorld(self):
        awaited_value = "Hello World!\n"
        captured_output = StringIO.StringIO()
        sys.stdout = captured_output
        hello_world()
        sys.stdout = sys.__stdout__
        self.assertEqual(captured_output.getvalue(), awaited_value, msg="you need print \"Hello World!\"")


if __name__ == '__main__':
    unittest.main()
