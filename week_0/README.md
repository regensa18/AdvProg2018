# Exercise 0: Basic Git Usage & Simple Python Programming

CSCM602023 - Advanced Programming (Pemrograman Lanjut) @ Faculty of
Computer Science Universitas Indonesia, Even Semester 2016/2017

* * *

Hello! Welcome to the first Advanced Programming tutorial! You are
going to learn how to use basic Git commands and write a simple program
in Python. 

This tutorial is divided into two parts. The first part is introduction
to basic Git commands. You will learn how to create a Git repository in
your local machine, saving your work into repository, and pushing your
repository to a remote Git repository.

The second part of this tutorial is to review how to create a simple,
OO-based program in Python. The program will read a CSV file and do
simple data processing.

## First Part: Git 101

During your life as a CS student, you may have used some sort of version
control system. Probably the most pervasive example is undo functionality
in text editor. Whenever you made some mistakes, you can revert back to
previous state of your work by using undo function in text editor. Another
example is when you are working on a document collaboratively using Google
Drive where you can see every revisions made to the document.

In this course, you are going to use Git extensively. Git is a version
control system that commonly used to track changes in software artefacts.
It works by capturing the states of items in the software artefacts as
series of commits. The commits are arranged in linear manner from the
oldest commit to the most recent commit and may have several branches.
Think of it like a graph in which a node represents a commit and
directed edge(s) represent the connection from a commit to its
subsequent commit(s).

Enough with the background information. Let's start with the exercise!

1. Start your command-prompt or shell. In Windows, run `cmd`. In Linux-
based OS or Mac OS, you can use your favourite shell (e.g. Bash, zsh).
2. Set your current directory to a directory where you will store any
Advanced Programming-related work. Use `cd` commands to navigate to
a directory of your choice.
3. Create a new directory to store new files related to this exercise.
Try naming the directory to `git-exercise` and set your current
directory to the recently created directory.
4. Inside the new directory, execute `git init`. An empty Git
repository will be created inside this directory.
5. Try execute `git status`. It will print the state of Git repository
at time of command execution.
6. Create a new file named `README.md` and put your name, NPM, class in
the file.
7. Run `git status` again. Notice that there is an untracked file. It
means that there is a file that is not yet tracked by Git.
8. Add the file into Git by executing `git add README.md`.
9. Run `git status` again. The status message will be different from
previous `git status` execution. See that the `README.md` file is
put into section named `Changes to be committed`. It means that
`README.md` will be tracked by Git in the next commit.
10. As of now, `README.md` is not yet tracked by Git even though you
have run `git add README.md`. `git add` command only tells Git to
include changes in file(s) into Git's *staging area*. 
11. To persist the changes permanently into Git, run `git commit`.
A text editor (Vim) will appear where you have to write a message
describing the commit.
12. How to use Vim: `h j k l` to move cursor in Vim, `i` to switch to
INSERT mode, `escape` to switch back to COMMAND mode, `:w` in COMMAND
mode to write content buffer to output stream, `:q` in COMMAND mode
to exit Vim.
13. Once you have written the commit message, write the content and
then exit the text editor. The changes will be persisted into a commit
and stored in Git.
14. You are done.

You have just created a Git repository and start tracking changes to a
file in the repository. The repository that you just created is stored
in your own machine. If you are going to share your work with your
colleagues, you will like to have the repository is accessible on the
Web. In order to do that, you are going to put a copy of your repository
to an online Git hosting service named GitLab.

1. Go to GitLab.com by using your favourite Web browser.
2. Create an account or use an existing one if you have registered prior
to taking this course.
3. Create a new repository named **My First Git Repo** on GitLab and go
to its repository page. Ensure that you set the visibility to Public.
4. Find a section named clone URL in the page. Notice that there are 2
kinds of URL: HTTPS and SSH. Take note of the HTTPS URL.
5. You are going to update your local Git repository so your commits
can be stored in GitLab as well. Execute `git remote add origin <URL>`
where `<URL>` is the HTTPS URL of your GitLab repository. `git remote`
adds a path between your local repository with the repository on GitLab.
The path has an identifier named `origin`. By having this path, you can
begin storing your commits to the online repository as well.
6. To store your commits to your online GitLab repository, run `git push
-u origin master`. `git push -u` tells Git to push commits in your
local `master` branch to repository pointed by `origin` and set it as
the `upstream`. Any subsequent `git push` in `master` branch will be
automatically sent to `master` branch at `origin`.
7. Check your GitLab repository page. You will see that your files are
available on GitLab.

This ends the first part of the tutorial. Make sure that you have
informed your GitLab username to the teaching team (TA and lecturer)
so they can monitor your work.

## Second Part: Python 101

TODO

* * *

## Mandatory Tasks Checklist

- [ ] Local Git repository has `README.md` file
- [ ] Local Git repository contains at least one commit
- [ ] Local Git repository is synchronised with GitLab


## Additional Tasks Checklist

- [ ] TODO

## Additional Resources

- [ ] TODO
