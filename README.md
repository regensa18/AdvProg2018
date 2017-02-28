# CSCM602023 - Advanced Programming (Pemrograman Lanjut)

Welcome to the code repository for Advanced Programming 2017 course.
This repository hosts weekly tutorial codes and other, course-related
code snippets.

## Table of Contents

1. Weekly Exercises
    1. Exercise 0 - Introduction to Git
        - [International class](week_0_ki/README.md)
        - [Regular class](week_0_reg/README.md)
    2. [Exercise 1 - Abstract Factory & Builder](week_1/README.md)
    3. [Exercise 2 - Factory Method & Singleton](week_2/README.md)
    4. [Exercise 3 - Adapter & Bridge](week_3/README.md)
    5. [Exercise 4 - TBA](/#)
    6. [Exercise 5 - TBA](/#)
    7. [Exercise 6 - TBA](/#)
    8. [Exercise 7 - TBA](/#)
    9. [Exercise 8 - TBA](/#)
    10. [Exercise 9 - TBA](/#)
    10. [Exercise 10 - TBA](/#)
2. [Quickstart Guide](/#tldr)
3. [Initial Setup](/#initial-setup)
4. [Doing the Tutorial](/#doing-the-tutorial)
5. [Pulling Updates From Upstream](/#pulling-updates-from-upstream)

## TL;DR

First week of the class:

1. Fork this repository to your account
2. `git clone https://gitlab.com/<YOURNAME>/lab-exercises.git`
3. Change directory to the recently cloned directory, i.e. `cd lab-exercises`
4. `git remote add upstream https://gitlab.com/CSUI-AdvProg-2017/lab-exercises.git`
5. Tell us your GitLab username and URL to your tutorial repository

If there are updates from upstream:

1. `git pull upstream master`
2. Fix any merge conflict(s) that might arise (hopefully none)

Working on a tutorial problem set:

1. `cd week_n` where **n** is week number folder ID. E.g. **week_2**
2. `git checkout -b lab-week-n`
3. Do the exercises as instructed in its README.md file
4. Commit your work frequently
5. Write good commit message(s)
6. If your work is ready for grading: `git push -u origin lab-week-n`

If you want to know the detailed explanation about each instructions above,
please read the following sections.

## Initial Setup

1. Create a fork of this repository to your GitLab account, which
will create a copy of this repository under your own account.
2. Open the forked repository page at
`https://gitlab.com/<YOURNAME>/lab-exercises` where `<YOURNAME>`
is your GitLab username.
3. Set the clone URL to HTTPS and copy the URL into clipboard.
4. Clone the repository into your local machine. The Git command:
`git clone https://gitlab.com/<YOURNAME>/lab-exercises.git <PATH>`
where `<PATH>` is a path to a directory in your local machine.
5. Go to the directory where the cloned repository is located in your
local machine.
6. Add new remote called **upstream** that points to the original
GitLab repository. The Git command: `git remote add upstream https://gitlab.com/CSUI-AdvProg-2017/lab-exercises.git`
7. Tell your TA about your GitLab username and URL to your tutorial
repository so s/he can grade it later.
8. Ensure that your repository page has visibility level set to
**Internal** or **Public**. Check it in **Edit Project** menu at
your repository page.

## Doing the Tutorial

1. Suppose that you want to work on week 1 problem set. Go to the
directory that containing week 1 problem, i.e. `week_1`.
2. To ensure your work regarding week 1 problem is isolated from
your other attempts at other problems, create a new branch
specifically for working on week 1 problem. The Git command:
`git checkout -b lab-week-1`
3. Read the README file in `week_1` directory. It contains set of
mandatory and optional tasks that you can work on.
4. Do the tutorial.
5. Use `git add` or `git rm` to stage/unstage files that you want to
save into Git later.
6. Once you want to save your progress, commit your work to Git. The
Git command: `git commit` A text editor will apear where you should
write a commit message. Please try to follow the guidelines written
in [this guide](http://chris.beams.io/posts/git-commit/) on how to
write a good commit message.
7. Repeat steps 4 - 6 until you finished the tutorial.
8. Once you are ready to submit your work or you want to save it to
your repository on GitLab, do a Git push. The Git command: 
`git push -u origin lab-week-1`

## Pulling Updates From Upstream

If there are any updates from upstream, you can get the latest commits
and integrate it into your fork by using the following Git command:
`git pull upstream master`

## Tutorial Demonstration Mechanism

This demonstration mechanism applies for both students in Regular and
International classes:

1. Demonstrations should be done at most in the end of Friday of the
lab session week. The time allocation for the demonstration can be
adjusted to the availability of the Teaching Assistants. As long as
the demonstration is still done in Friday, students have the chance
to achieve maximum score for the tutorial.

2. If the demonstration is done after Friday and before the following
Tuesday, then the maximum score the student can get for that tutorial
is C, equivalent with attending the Lab session and only doing the
mandatory tasks.

3. Demonstrations will be done with the last commit made by the
student before 12:00 AM of Friday in the same week of the Lab session.
In other words, students can still work on the tutorial and push their
commits until Thursday 23:59 PM.

