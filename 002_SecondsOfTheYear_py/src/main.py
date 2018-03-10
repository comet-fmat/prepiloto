#!/usr/bin/env python2
# encoding: windows-1252


def main():
    # In below an incomplete version of the program. Please complete it!

    days_in_year = 365
    hours_in_day = 24
    minutes_in_hour = 60
    seconds_in_minute = 60

    seconds_in_year = days_in_year * hours_in_day * minutes_in_hour * seconds_in_minute

    print("There are " + str(seconds_in_year) + " seconds in a year")


if __name__ == "__main__":
    main()
