# Exercise 4: Composite, Decorator, and Facade Pattern

CSCM602023 - Advanced Programming (Pemrograman Lanjut) @ Faculty of
Computer Science Universitas Indonesia, Even Semester 2016/2017

* * *

[![build status](https://gitlab.com/CSUI-AdvProg-2017/lab-exercises/badges/week-4/build.svg)](https://gitlab.com/CSUI-AdvProg-2017/lab-exercises/commits/week-4)

Your tasks in this exercise are to complete a partial implementation
of Composite pattern and create a simple decorator function. The code
for Composite pattern is taken from an example available where it 
illustrates the traditional Composite pattern implementation by having
separate classes for representing **simple** and **composite** items.

The code contains several parts that already been omitted in a way that
it fails the unit tests. You are required to complete the code and
ensure that it pass every unit tests (i.e. achieving `green` build in
GitLab pipeline).

Your code will be run by GitLab CI Runner instance where it will do
`git clone` to your repository and try to run one or more jobs that
will evaluate the correctness of your work. If everything goes well
on every predefined jobs, the [Pipeline](https://gitlab.com/CSUI-AdvProg-2017/lab-exercises/pipelines)
will report a `green` (i.e. success) build. Otherwise, it will report
`orange` (i.e. warning) or `red` (i.e. fail) build.

However, you can manually run the unit tests in your own PC. You can
do so by executing the following command in your shell:
`python -m unittest week_4/test_week4.py`

You also need to create a simple decorator function named `logged()`
in this exercise. The specifications for the decorator function is
as follows:

1. The decorator shall print the **name of the decorated function**
**BEFORE** the decorated function is called
2. The decorator shall print the **number of arguments** passed to the
decorated function **BEFORE** the decorated function is called
3. (Optional) The decorator also print the **string representation of
each arguments** that passed to the decorated function **BEFORE** the
decorated function is called
4. The decorator will be applied to a function with varying
number of arguments, i.e. it can be a function without arguments or
function with any number of arguments

At the end of exercise, you are also asked to understand a toy example
of Facade pattern implementation and write your explanation into a text
file. Ensure that you can explain it to your TA as well. At minimum,
you should be able to explain the structure, purpose, and benefit of
Facade pattern.

* * *

## Mandatory Checklist

You are required to do all tasks in the mandatory checklist. You also
need to be able to explain your works to your TA during demo session.

Enabling pipeline
* [ ] enable your pipeline access so it can be accessed by everyone by
going to the link https://gitlab.com/[YOUR_GITLAB_USERNAME]/lab-exercises/edit
and select pipeline: everyone with access

For week4.py
* [ ] All unit tests (except `test_composite()`) related to methods in 
    `SimpleItem` pass without failures.
* [ ] The state of work related to `SimpleItem` implementation is commited 
    and pushed to GitLab.
* [ ] All unit tests (except `test_composite()`) related to methods in 
    `CompositeItem` pass without failures.
* [ ] The state of work related to `CompositeItem` implementation is 
    commited and pushed to GitLab.
* [ ] All unit tests (except `test_create()`, `test_compose()`, 
    `test_composite()`, and `test_print_simple()`) related to methods in 
    `Item` pass without failures.
* [ ] The state of work related to `Item` implementation is 
    commited and pushed to GitLab.
* [ ] Implemented `logged()` function decorator.
* [ ] Decorated `make_item()` and `make_composite()` functions with 
    `logged()` function decorator.
* [ ] The `logged()` decorator is working properly when the program 
    calls `make_item()` and `make_composite()`.
* [ ] The state of work related to implementing function decorator is
    commited and pushed to GitLab.

For FacadeDemo.py
* [ ] Explained in a new text file named m2facade.txt what is Facade Pattern,
its structure, functionality, and benefit, and how it is implemented inside
FacadeDemo.py (point out what makes it Facade Pattern)

## Additional Checklist

For week4.py
* [ ] Implemented `test_composite()` unit test in `SimpleItemTest`.
* [ ] Implemented `test_composite()` unit test in `CompositeItemTest`.
* [ ] Implemented remaining unit tests in `ItemTest`.
* [ ] Implemented `do_log()` class decorator.
* [ ] Decorated `Item` class with `do_log()` class decorator.
* [ ] The `do_log()` class decorator is working properly when the 
    program is run.

## Additional Resources

N/A
