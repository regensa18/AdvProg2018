# Tutorial Problem Sets

CSCM602023 Advanced Programming @ Faculty of Computer Science Universitas
Indonesia, Term 2 2017/2018

* * *

Welcome to the code repository for Advanced Programming 2018 course.
This repository hosts weekly tutorial codes and other, course-related
code snippets.

## TL;DR

First week of the class:

1. Fork this repository to your account
2. `git clone https://gitlab.com/<YOURNAME>/lab.git`
3. Change directory to the recently cloned directory, i.e. `cd lab`
4. `git remote add upstream https://gitlab.com/csui-advprog-2018/lab.git`
5. Tell us your GitLab username and URL to your tutorial repository

If there are updates from upstream:

1. `git pull upstream master`
2. Fix any merge conflict(s) that might arise (hopefully none)
    - Always choose latest commit from `upstream` when fixing merge
    conflict(s)
3. Do not forget to commit your merged `master` branch and push it
to your own `master` branch at GitLab repository
    - Use Git command: `git push origin master`

Working on a tutorial problem set:

1. Pull any updates from `upstream`
2. `cd tutorial-n` where **n** is week number folder ID. E.g. **tutorial-2**
3. `git checkout -b tutorial-n master`
4. Do the exercises as instructed in its README.md file
5. Commit your work frequently
6. Write good commit message(s)
7. If your work is ready for grading: `git push -u origin tutorial-n`

If you want to know the detailed explanation about each instructions above,
please read the following sections.

## Initial Setup

1. Create a fork of this repository to your GitLab account, which
will create a copy of this repository under your own account.
2. Open the forked repository page at
`https://gitlab.com/<YOURNAME>/lab` where `<YOURNAME>`
is your GitLab username.
3. Set the clone URL to HTTPS and copy the URL into clipboard.
4. Clone the repository into your local machine. Use Git command:
`git clone https://gitlab.com/<YOURNAME>/lab.git <PATH>`
where `<PATH>` is a path to a directory in your local machine.
5. Go to the directory where the cloned repository is located in your
local machine.
6. Add new remote called **upstream** that points to the original
GitLab repository. Use Git command: `git remote add upstream https://gitlab.com/csui-advprog-2018/lab.git`
7. Tell your TA about your GitLab username and URL to your tutorial
repository so s/he can grade it later.
8. Ensure that your repository page has visibility level set to
**Internal** or **Public**. Check it in **Edit Project** menu at
your repository page.

## Doing the Tutorial

1. Suppose that you want to work on week 1 problem set. Go to the
directory that containing week 1 problem, i.e. `tutorial-1`.
2. To ensure your work regarding week 1 problem is isolated from
your other attempts at other problems, create a new branch
specifically for working on week 1 problem. Use Git command:
`git checkout -b tutorial-1 master`
    - Explanation: Create a new branch named `tutorial-1` based on 
    latest commit in `master` branch.
3. Read the README file in `tutorial-1` directory. It contains set of
mandatory and optional tasks that you can work on.
4. Do the tutorial.
5. Use `git add` or `git rm` to stage/unstage files that you want to
save into Git later.
6. Once you want to save your progress, commit your work to Git. Use
Git command: `git commit` A text editor will apear where you should
write a commit message. Please try to follow the guidelines written
in [this guide](http://chris.beams.io/posts/git-commit/) on how to
write a good commit message.
7. Repeat steps 4 - 6 until you finished the tutorial.
8. Once you are ready to submit your work or you want to save it to
your repository on GitLab, do a Git push. The Git command: 
`git push -u origin tutorial-1`

## Pulling Updates From Upstream

If there are any updates from upstream, you can get the latest commits
and integrate it into your fork by using the following Git command:
`git pull upstream master`

Merge conflicts may arise since the repository is updated weekly and
may have overlapping changes with the `master` branch in your own
forked repository. If merge conflict happens, please always use latest
commit from `upstream`. Your works are safe as long you put in in its
own separate branches, e.g. `tutorial-1`, `tutorial-2`, and so forth.

Once you have resolved any merge conflicts and all commits from
upstream are merged succesfully to your own `master` branch, do not
forget to push it back to your own GitLab repository. Use Git command:
`git push origin master`

## Grading Scheme & Demonstration

Weekly tutorials contribute **10%** to the final grade of this course.
For each exercises, student can obtain grade ranging from **A (4)** to
**E (0)**. The grading scheme is as follows:

1. **A** if student completed **all mandatory and optional tasks**
2. **B** if student completed **all mandatory tasks** and **at least
    half of the optional tasks**
3. **C** if student completed **at least half of the mandatory tasks**
4. **D** if student did not demonstrate their work to teaching
    assistant, **regardless the completion of the tasks**
5. **E** if student skipped the tutorial by doing nothing, e.g.
    no signs of work or branch related to the tutorial in the
    repository

All students required to demonstrate their work to teaching assistant.
The standard procedures on demonstrating lab work to TA will be provided
later.

# License

Copyright (c) 2018, Faculty of Computer Science Universitas Indonesia

Permission to copy, modify, and share the works in this project are governed
under two licenses: [BSD 3-Clause][1] and [Creative Commons Attribution-ShareAlike 4.0 (CC BY-SA 4.0)][2]
Unless noted otherwise, BSD 3-Clause applies to source code (e.g. Java, YML,
configuration files), while CC BY-SA 4.0 applies to text documents in this project.

[1]: LICENSE
[2]: https://creativecommons.org/licenses/by-sa/4.0/
