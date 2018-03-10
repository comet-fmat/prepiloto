#!/usr/bin/env python2
import unittest
import sys
sys.path.append('../')
import StringIO
from tmc import points
from src.main import main


@points('1.0')
class MainTest(unittest.TestCase):
    __qualname__ = "MainTest"

    def test_second_of_the_year(self):
        answer = "31536000"
        captured_output = StringIO.StringIO()
        sys.stdout = captured_output
        main()
        sys.stdout = sys.__stdout__
        self.assertTrue((answer in captured_output.getvalue()), msg="Printed value is not correct!")


if __name__ == '__main__':
    unittest.main()
