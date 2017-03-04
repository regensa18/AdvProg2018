# Exercise 4: Composite, Decorator, and Fa Pattern

CSCM602023 - Advanced Programming (Pemrograman Lanjut) @ Faculty of
Computer Science Universitas Indonesia, Even Semester 2016/2017

* * *

[![build status](https://gitlab.com/CSUI-AdvProg-2017/lab-exercises/badges/week-4/build.svg)](https://gitlab.com/CSUI-AdvProg-2017/lab-exercises/commits/week-4)* * *

*Friday, March 10th 2017*

Your task in this exercise is to complete two kinds of Composite 
pattern implementation and implement two decorators. You are 
given a simple program that illustrates how simple and composite 
objects are created in each version of Composite pattern implementation 
as described in the textbook. The program has several parts have 
been omitted and need to be implemented.

During the course of this exercise, you are also asked to implement 
a function decorator (mandatory) and a class decorator (optional). 
The specification of both decorators are described in in-class 
worksheet that is distributed in Wednesday.

# Mandatory Checklist

You are required to do all tasks in the mandatory checklist. You also
need to be able to explain your works to your TA during demo session.


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

Additional Checklist
--------------------

* [ ] Implemented `test_composite()` unit test in `SimpleItemTest`.
* [ ] Implemented `test_composite()` unit test in `CompositeItemTest`.
* [ ] Implemented remaining unit tests in `ItemTest`.
* [ ] Implemented `do_log()` class decorator.
* [ ] Decorated `Item` class with `do_log()` class decorator.
* [ ] The `do_log()` class decorator is working properly when the 
    program is run.

Additional Resources
--------------------

N/A

