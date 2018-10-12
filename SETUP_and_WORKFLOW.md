# SETTING UP SOFTWARE AND ACCOUNTS FOR THE COURSE
This course will be using the **Eclipse Integrated Development Environment (IDE)** and **GitHub** to submit/retrieve code.
The Eclipse IDK is dependent on the **Java Software Development Kit (JDK)**, which you will also need to install if not already on your computer.

### Installing JDK
1. Go to the [Java SE download site](https://www.oracle.com/technetwork/java/javase/downloads/index.html).
2. Under **Java Platform, Standard Edition**, **Java SE 10.0.{x}**, where {x} denotes a fast running update number, click the **Download** button under **JDK**.
3. Check **Accept License Agreement**, **choose your Operating System**, and **download** the installer.
4. **Install as you usually would** any other application/program/package on your OS.

NOTE: **On some Mac Systems, JDK has been pre-installed**. To check, **open the Terminal** and issue this command `javac -version`. If a JDK version number appears, it is **already installed**. If `command not found` or `To open javac, you need a java runtime` appears, it is not, so install accordingly.

### Installing Eclipse for Windows
1. Go to the **[Eclipse downloads](https://www.eclipse.org/downloads/)**, and under **Get Eclipse SimRel 2018-09**, click **Download Packages**.
2. Scroll to **Eclipse IDE for Java Developers**, and click the download link for Windows.
3. To install, **unzip** the downloaded folder to a directory of your choice e.g. `c:\eclipse`. There is **no need to run any installer**, and if you want to uninstall it, you can just delete that folder without running an uninstaller.

### Installing Eclipse for Macs
1. Go to the **[Eclipse downloads](https://www.eclipse.org/downloads/)**, and under **Get Eclipse SimRel 2018-09**, click **Download Packages**.
2. Scroll to **Eclipse IDE for Java Developers**, and click the download link for Mac.
3. Double-click the downloaded Disk Image (**DMG**) file, follow the installer instructions, then eject it once you're done (as you would when installing any Mac application). Eclipse should be installed under `Applications/eclipse` by default.

### Installing Eclipse for Linux
1. Go to the **[Eclipse downloads](https://www.eclipse.org/downloads/)**, and under **Get Eclipse SimRel 2018-09**, click **Download Packages**.
2. Scroll to **Eclipse IDE for Java Developers**, and click the download link for Linux. You will receive a **tarball** in the `~/Downloads`folder.
3. Install Eclipse into `/usr/local`. **Enter the following in your terminal**:
```bash
cd /usr/local/
sudo tar xzvf ~/Downloads/eclipse-javascript-2018-09-linux-gtk-x86_64.tar.gz # or the 32-bit one if you clicked that
cd /usr/local
sudo chown -R your-username:your-groupname eclipse # Change ownership (optional)
cd /usr/bin
sudo ln -s /usr/local/eclipse/eclipse # Make a symlink in /usr/bin, which is in the PATH
ls -ld /usr/bin/eclipse
which eclipse # check if installed
```

### Creating a GitHub Account
GitHub is a really popular online platform for **working on coding projects collaboratively** with other people anywhere, all over the world. You can find a lot of different **projects that you can contribute to**, and **get help for any of your own projects** from other people as well. One of the most crucial features of GitHub is **version control**. This means that if you **commit new code** for something which **overwrites previous code** that you wrote before, but later realize the previous version was better than your most recent changes, you can **easily revert your code** to the last version because **GitHub tracks those changes you committed**. It also allows contributors to **merge changes they did without accidentally overwriting** changes from other contributors. Think of GitHub as saving multiple separate drafts of an essay, mixed with the collaborative nature of Google Documents, but with code.

1. Go to the [GitHub main website](https://github.com/).
2. Pick a **username**, enter your **email**, and your chosen **password**, and click **Sign Up**.
3. Select the **FREE** plan, then customize your **preferences** to however you want, and you're done!

### Installing Git for your Command Line
To use GitHub effectively, you will need to learn how to use **git commands from the command line** in your OS. Your command line is basically a console where you can type in instructions in a language (usually **bash** or **shell**) for your computer to execute. **It's able to do some things that you could normally do with your mouse** e.g. create/edit/move/copy/delete files and folders. Depending on your OS, your command line is one of the following:
- **Windows**: Command Prompt or Powershell (you can also use the Linux Ubuntu terminal app if you have it installed)
- **Mac**: Terminal
- **Linux (Ubuntu distribution)**: Terminal

**For Windows Users**:
1. Go to the **Git website** with the [Windows download](https://git-scm.com/download/win). It should **automatically attempt to download the latest version** fit for your computer.
2. Select **Run** to begin installation. The process should be like installing **any other application** for Windows.
3. Keep hitting **next** until installation starts. Feel free to **customize things** you want along the way but I **highly recommend sticking to the defaults**.
4. For Windows users, I **highly recommend** installing [Git Bash](https://gitforwindows.org/) for your terminal as well and **using the Git Bash terminal for any GitHub-related commands**.

**For Mac Users**:
1. Open your Terminal app. If you do not have [Homebrew](https://brew.sh/) installed, install it first by **copying the installation command and pasting it in your terminal** and hitting enter, and following the installation instructions (**you will have to enter your password** at one point). **Homebrew is really useful for installing applications on your Mac via the command line**. Once it is installed successfully, **proceed to the next step**. If you already had it installed, enter `brew update` in your terminal and hit enter.
2. Now enter `brew install git` and follow the installation instructions as well (it will likely ask for your GitHub username and password; enter them if it does).

**For Linux (Ubuntu) Users**:
1. Open your terminal, and enter `sudo apt-get install git` and hit enter.
2. Follow installation instructions (it will likely ask for your GitHub username and password; enter them if it does).

## Workflow for the Course
We are using GitHub as a way for students to easily **obtain any code from lessons/assignments/labs** etc., ensure it is **up to date**, and for students to **commit code online** so that myself and other students in the course can see what you have done and comment on any improvements. It's also for **tracking changes** to ensure things are **submitted on time**, and so you can **revert changes** if need be. However, GitHub can be confusing to use at first to a point where it can be frustrating or seem unnecessary or not worth the effort to learn. Below are some steps to **ease the learning curve** and help to ensure that your experience with GitHub is smooth-sailing.

### Setting Up Your GitHub Account for the Class and Obtaining a Copy of the Class Repository (both locally and online on your account)
1. While logged into your account, go to the [class repository](https://github.com/alyeffy/AP-CS-A_2018-2019).
2. In the top right corner, click the **Fork** button to have a copy of all the code and other files in the repository onto your account. Your account now has an **online copy** of the class repository that contains everything it has **from the time you copied it**.
3. Open **Eclipse**, go to `File > Import > Git > Projects from Git`, and click **Clone URL**.
4. Go to your account page with the online copy of the class repository. It should be at `https://github.com/your_username/AP-CS-A_2018-2019`.
5. Click the **Clone or download** button, and **copy** the URL there, and **paste** it into the URL field in Eclipse.
6. Click **next**, make sure only the **master** branch is checked, click **next**, TAKE NOTE of the directory the repository will be placed in (you can change it; just make sure you **remember where it is**), and click **next** again.
7. When it asks you to **select a wizard** for importing projects, select **Import as general project**. You now have the **local repository copy, accessible via Eclipse**.
8. You now need to make sure that when you **make, save, and commit changes** to your code in your **local repository** copy, it will get **pushed to your online copy**, so that myself and other students can see the changes.
9. Open your command line, and **navigate to your local repository copy** (the directory you cloned it to above) **within the command line** using these commands.
```bash
pwd   # Prints the current directory you are in
cd    # This goes to your home
cd .. # Goes to the folder outside the current one you are in
ls .  # Lists the files/folders in the current directory you are in (leaving . blank also works, replacing . with the name of a folder in your current directory lists the files/folders in that folder)
cd .  # Changes directory to that folder (that is in the current directory you are in)
```
e.g. **On Macs**, if you are in the `/Users/your_username` directory (use pwd to check), and the local repository is in the `/Users/your_username/git/AP-CS-A_2018-2019` directory, then you need to type in and enter:
```bash
cd git/AP-CSA_2018-2019 # Tip: as you start typing the folder names, hit TAB and it will autofill the names for you
pwd # this is just to check you are in the right directory, it should print /Users/your_username/git/AP-CS-A_2018-2019.
```
10. From that directory, enter `git remote -v`, and you should get the following result.
```bash
origin  https://github.com/YOUR_USERNAME/AP-CS-A_2018-2019.git (fetch)
origin  https://github.com/YOUR_USERNAME/AP-CS-A_2018-2019.git (pull)
```
11. Enter the following `git remote add upstream https://github.com/alyeffy/AP-CS-A_2018-2019.git`.

12. Enter `git remote -v` to check that it worked. You should see this:
```bash
origin    https://github.com/YOUR_USERNAME/AP-CS-A_2018-2019.git (fetch)
origin    https://github.com/YOUR_USERNAME/AP-CS-A_2018-2019.git (pull)
upstream  https://github.com/alyeffy/AP-CS-A_2018-2019.git (fetch)
upstream  https://github.com/alyeffy/AP-CS-A_2018-2019.git (pull)
```

## Announcements and Questions - Using GitHub Issues
GitHub [issues](https://github.com/alyeffy/AP-CS-A_2018-2019/issues) on the **orginal repository** will be used as "threads" for ongoing announcements, questions, discussions in the class and will display deadlines and updates. **Check the issues on the original repository regularly, especially before and after lessons, to keep up with the course**. For formatting your comments, please refer to this [GitHub Markdown cheatsheet](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet).

### Updating Your Local Repository with the Original Course One Without Overwriting Your Code - Using the Command Line
1. Open your command line, and **navigate** to the directory where your local repository is located.
2. Check that you are in the **master branch**. Enter `git branch`. If beside `master` you see `*`, you are in the master branch. If not, enter `git checkout master` to **switch** to the master branch.
3. Enter `git fetch upstream` to get all the changes from the **original master branch**, which will be placed into the `upstream/master` branch in your local repository.
4. **Merge these changes without losing your own changes** by entering: `git merge upstream/master`.
5. **DO THIS PROCESS WHENEVER YOU SEE I HAVE UPDATED THE ORIGINAL REPOSITORY**, especially before starting any assignments/labs (check the [**latest commit**](https://github.com/alyeffy/AP-CS-A_2018-2019)).

Alternatively, **not recommended**, but you can update changes **from the original repository to your online one** via the **browser**, AND THEN **pull** those changes to your local copy **using the command line**.
1. Go to your online fork of the repository: https://github.com/your_username/AP-CS-A_2018-2019.
2. Click the **compare** button, which will open the **Comparing Changes** page.
3. Change the **base fork** to **your repository**, click **compare across forks**, then change the **head fork** to the **original repository**.
4. If you see "**There isn't anything to compare**", your repository has the **most recent changes from the original**. If not, you will see a **list of commits** that have changed in the original repository that your **local online one does not have*.
5. Create a pull request to confirm the changes and merge it when necessary. If there are any **merge conflicts**, you can fix them in the online editor.
6. Once that is done, **navigate to your local repository** copy directory in the command line, ensure that you are in the **master** branch, and enter `git pull` to **pull the new changes to your local copy**.

### Working on Assignments, Labs etc.
1. Whenever you are writing code for an assignment, lab, etc., you should **work on a separate branch for each**. **BEFORE YOU START ANY ASSIGNMENT/LAB etc. ensure you are on the correct branch**. First, check which branch you are currently on using `git branch`. If you **just forked the repository**, it will only show the **master** branch, which should have `*` beside it, indicating that you are **currently on that branch**.
2. If this is the case, enter `git branch assignments` and `git branch labs`. This will create 2 branches: **assignments** and **labs**. However, these are **local branches**, and you need to **commit and push them** so that they are **available online**, and **any changes you commit** to them will be **reflected online as well**. To do this, enter `git push -u origin <branch_name>` for both the assignments and labs branches.
3. Now, if you are working on an **assignment**, **first obtain any code you need** from the original repository to the **master branch** of your local repository (**follow update process above**). Then, switch to the **assignments branch** by entering `git checkout assignments`, then enter `git pull origin master` to obtain any **updates to the master branch** of your local repository for your **assignments branch** as well. This way, you will have a **local copy of original unedited assignment code** files in the **master branch**, and the assignment code files with **your changes** in the **assignments branch**.
4. **You can now start working on the code**, and if you are working on a lab, do the same above step but with the **labs branch** instead.

### Saving, Committing, and Pushing Your Local Code Changes to Your Online Repository Fork
1. If you have written code in your local repository using Eclipse and **saved it**, your changes **won't be reflected in your online repository until you commit and push** them.
2. Open your command line, and **navigate** to the directory where your **local repository** is located.
3. Ensure that all the changes you've made in your **current working branch of your local repository** (including **adding/deleting/editing files and folders**) are ones that you want in the **corresponding branch of your online repository** i.e. you should not be committing assignment/lab code to the master branch. If so, enter `git add .`. This notes **anything your local repository has/doesn't have** that your online repository doesn't have/has as **changes to be committed**. If you want to add specific files, enter `git add <file_name>`.
4. Commit these changes by entering `git commit -m <commit-message>`. Whenever you are committing changes, GitHub requires you to **write a short statement summarizing what these changes are**. This helps with **tracking changes to your repository over time**.
5. Once that is done, enter `git push` to finally push these changes to your online repository, which you should be able to see as the **latest commit** at https://github.com/your_username/AP-CS-A_2018-2019, and other people can see the changes you have made and comment on them.

For more information on how to use GitHub's features, check out this [tutorial](https://www.atlassian.com/git/tutorials/atlassian-git-cheatsheet).
