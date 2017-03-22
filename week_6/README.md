# Exercise 6: Observer & Mediator Patterns

CSCM602023 - Advanced Programming (Pemrograman Lanjut) @ Faculty of
Computer Science Universitas Indonesia, Even Semester 2016/2017

[![build status](https://gitlab.com/CSUI-AdvProg-2017/lab-exercises/badges/week-6/build.svg)](https://gitlab.com/CSUI-AdvProg-2017/lab-exercises/commits/week-6)

* * *

Today we are going to learn about Observer & Mediator patterns in Python

What is Observer pattern?

Observer pattern is a software design pattern in which an object, called the subject,
maintains a list of its dependents, called observers, and notifies them automatically
of any state changes, usually by calling one of their methods.

To learn more about Observer, we already have two files in this tutorial
that would help you learn: `s_observer_main.py` and `simple_observer.py`.

What you need to do is to complete the unfinished python module of `simple_observer.py`.

In the `simple_observer.py`, there are two classes which are **Subscriber** and **Publisher**:

- **Subscriber**: A class that represents a subscriber of some services which in this case
will receive broadcasts from the publisher
- **Publisher**: A class that represents a publisher which broadcasts messages for 
its subscribers

The Publisher class contains the following methods:
	
- `init`: Initiates a publisher that has no subscribers yet
- `register`: Adds a subscriber into the subscribers list
- `unregister`: Removes a subscriber from the subscribers list
- `notify`: Distributes a message to each subscriber

-----------------------------------------------------------------------

After completing the Observer module, run the `s_observer_main.py` 

**Expected output**:

    Bob got message "it's Lunchtime!"
    John got message "it's Lunchtime!"
    Alice got message "it's Lunchtime!"
    Bob got message "Time for dinner"
    Alice got message "Time for dinner"

--------------------------------------------------------------------------

Let's try the next observer pattern. It's similiar to the previous Observer pattern,
you must complete the unfinished code in `observer.py`

There are four classes in `observer.py`, which are:
- **Subject**: A class that controls the Data
- **Data**: A class that represents data that would be processed in this module
- **HexViewer**: A class that represents the data in Hex
- **DecimalViewer**: A class that represents the data in Decimal

All you need to do is to complete the Subject class that is similiar to the previous observer

There are several classes:
- `init`: Initiates list of observers
- `register`: Adds the observer into the observers list, but first thing to do is to check if the observer
is unique (not in observers list)
- `unregister`: Removes the observer from the observers list, but make sure you catch the `ValueError`
- `notify`: Updates the value each of observer from the observers list, but make sure that the modifier had a different value with the current value in observer

**Expected Output**:

    Setting Data 1 = 10
    DecimalViewer: Subject Data 1 has data 10
    HexViewer: Subject Data 1 has data 0xa
    Setting Data 2 = 15
    HexViewer: Subject Data 2 has data 0xf
    DecimalViewer: Subject Data 2 has data 15
    Setting Data 1 = 3
    DecimalViewer: Subject Data 1 has data 3
    HexViewer: Subject Data 1 has data 0x3
    Setting Data 2 = 5
    HexViewer: Subject Data 2 has data 0x5
    DecimalViewer: Subject Data 2 has data 5
    Detach HexViewer from Data 1 and Data 2.
    Setting Data 1 = 10
    DecimalViewer: Subject Data 1 has data 10
    Setting Data 2 = 15
    DecimalViewer: Subject Data 2 has data 15

----------------------------------------------------------------------------------------------------------

What is the Mediator pattern?

Mediator pattern is a software design pattern which defines an object that
encapsulates how a set of object interact.

There is a module called Mediator which includes several classes:

**TestController**, which has several modules:

- `init`: Initiates the **TestManager** and bProblem (binary problem)
- `setup`: Sets up the tests
- `execute`: There are two procedures:
    -  First, if there is a problem test, it would give
    the notification `"Executing the test"` and then sleeps for 0.1 second.
    - Second, if there isn't, it would give the notification `"Problem in the
    setup. Test not executed"`.
- `tearDown`: There are two procedures:
    - First, if there is a problem test, it would give
    the notification `"Tearing down"` and then sleeps for 0.1 second and calls the
    method `publishReport` from the **TestManager** class.
    - Second, if it's not tearing down, it would give the notification
    `"Test not executed. No tear down required."` 
- `setTM`: Sets up the **TestManager**
- `setProblem`: Sets the value for the bProblem (0 or 1)

**TestManager**, which has several modules:

- `init`: Initiates the **Reporter**, **DataBase**, and **TestController** classes
- `prepareReporting`: There is a variable called `rvalue` which gets its value
by calling `insert` method in **DataBase**, and if `rvalue` equals 1, then it would
call **TestController** to set the problem into 1, and then the **Reporter** would be
calling its `prepare` method. 
- `setReporter`: Sets up the **Reporter**
- `setDB`: Sets up the **DataBase**
- `publishReport`: Updates the **DataBase**, and then **Reporter** would call its `report` method
- `setTC`: Sets up the **TestController**

The Mediator program flow:

1. First, the program creates instances of each classes with the help of `setReporter()`, `setDB()`,
and `setTM()` methods
2. When test category starts execution, **TestManager** class and the **TestController** class registers with each other. 
**TestController** first calls the `setup()` method which in turn requests the **TestManager** class to be prepared for 
reporting of the test execution results using the `prepareReporting()` method. 
3. `prepareReporting()` method of the **TestManager** communicates with other _Colleagues_ (**Reporter** and **DataBase**) 
in the system by calling the `prepare()` and `insert()` methods 
4. `execute()` method of **TestController** is responsible for running the tests
5. When the test is finished, `tearDown()` from **TestController** class is called, which in turn calls the `publishReport()`
method of the **TestManager** which communicates with classes **Reporter** and **DataBase**.
6. During `insert()`, if communiation between **TestController** and **TestManager** fails, the next step in test execution is conveyed of this failure.

After completing all above, run the `mediator.py` to see what really happens.

**Expected Output**:

    Setting up the Test
    Inserting the execution begin status in the Database
    Executing the test
    Tearing down
    Updating the test results in Database
    Reporting the results of Test
    Setting up the Test
    Inserting the execution begin status in the Database
    Reporter Class is preparing to report the results
    Problem in setup. Test not executed.
    Test not executed. No tear down required.
    Setting up the Test
    Inserting the execution begin status in the Database
    Executing the test
    Tearing down
    Updating the test results in Database
    Reporting the results of Test

* * *

## Mandatory Checklist

- [ ] Complete the `simple_observer.py`
- [ ] Complete the `mediator.py`
- [ ] Complete the `observer.py`

## Additional Checklist

- [ ] Complete the `additional_observer.py`
- [ ] Explain what is happening in `mediator.py` and its connection to
Mediator design pattern in theory
- [ ] Explain what is happening in `simple_observer.py`, `observer.py`,
`additional_observer.py` and its connection to Observer design pattern
in theory

## Additional Resources

- N/A
