<p align="center">
  <img src="https://img.icons8.com/external-tal-revivo-regular-tal-revivo/96/external-readme-is-a-easy-to-build-a-developer-hub-that-adapts-to-the-user-logo-regular-tal-revivo.png" width="100" />
</p>
<p align="center">
    <h1 align="center">JAVA_LAB</h1>
</p>
<p align="center">
    <em><code>► A repository containing all the source code during lab session of Advanced JAVA</code></em>
</p>
<p align="center">
	<img src="https://img.shields.io/github/license/Pravakar-RijaI/Java_Lab?style=flat&color=0080ff" alt="license">
	<img src="https://img.shields.io/github/last-commit/Pravakar-RijaI/Java_Lab?style=flat&logo=git&logoColor=white&color=0080ff" alt="last-commit">
	<img src="https://img.shields.io/github/languages/top/Pravakar-RijaI/Java_Lab?style=flat&color=0080ff" alt="repo-top-language">
	<img src="https://img.shields.io/github/languages/count/Pravakar-RijaI/Java_Lab?style=flat&color=0080ff" alt="repo-language-count">
<p>
<p align="center">
		<em>Developed with the software and tools below.</em>
</p>
<p align="center">
	<img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white" alt="java">
</p>
<hr>

## 🔗 Quick Links

> - [📍 Overview](#-overview)
> - [📂 Repository Structure](#-repository-structure)
> - [🧩 Modules](#-modules)
> - [🚀 Getting Started](#-getting-started)
>   - [⚙️ Installation](#️-installation)
>   - [🤖 Development Environment](#-development_environment)
> - [🤝 Contributing](#-contributing)
> - [👏 Acknowledgments](#-acknowledgments)

---

## 📍 Overview

<code>A respository containing all the assignments and lab source codes during Advanced JAVA course in Bhaktapur Multiple Campus, BScCSIT course Seventh Semester..</code>

---

## 📂 Repository Structure

```sh
└── Java_Lab/
    ├── README.md
    ├── Setup_Instructions.txt
    ├── class_01
    │   ├── BoilerPlate.class
    │   └── BoilerPlate.java
    ├── class_02
    │   ├── Citizen.java
    │   ├── CitizenDemo.java
    │   ├── DivisibleBy.java
    │   ├── DivisibleByDemo.java
    │   ├── Fibo.java
    │   ├── FiboDemo.java
    │   ├── IndividualDigit.java
    │   ├── PrintSeries.java
    │   ├── PrintSeriesDemo.java
    │   ├── User.java
    │   └── UserDemo.java
    ├── class_03
    │   ├── Assignment
    │   │   ├── Armstrong.java
    │   │   ├── ArmstrongDemo.java
    │   │   ├── IndividualDigit.java
    │   │   ├── IndividualDigitDemo.java
    │   │   ├── Palindrome.java
    │   │   └── PalindromeDemo.java
    │   └── Lab
    │       └── lab.txt
    ├── class_04
    │   ├── Assignment
    │   │   └── assignment.txt
    │   └── Lab
    │       └── lab.txt
    └── class_05
        ├── Assignment
        │   └── assignment.txt
        └── Lab
            └── lab.txt
```

---

## 🚀 Getting Started

**_Requirements_**

Ensure you have the following dependencies installed on your system:

- **JDK Development Kit**: `version  22.0.2`

### ⚙️ Installation

1. Clone the Java_Lab repository:

```sh
git clone https://github.com/Pravakar-RijaI/Java_Lab
```

2. Change to the project directory:

```sh
cd Java_Lab
```

### ⚙️ Development Environment

JDK Installation:

1. Check if JDK is Installed:
   Open a command prompt or terminal.
   Run the following commands:
   javac -version
   java -version

If you encounter an error like “‘javac’ is not recognized as an internal or external command,” check if JDK is
already installed in C:\Program Files\Common Files\Oracle\Java\javapath.
If JDK is not installed, proceed to step 2.
If JDK is installed and error persists, proceed to step 3.

2.Download and Install JDK:
Visit the Java Downloads page on Oracle’s website.
Download the JDK 22 installer for your operating system (Windows in this case).
Run the installer (e.g., jdk-22_windows-x64_bin.msi) and follow the installation instructions.
Now, if environment variable is set by installer skip step 3, otherwise proceed to step 3.

3.Adding JDK “bin” Directory to Path Setting (Windows):
Open Control Panel > System and Security > System.
Click Advanced system settings.
Click Environment Variables.
Under System variables, select Path and click Edit.
Add the jdk installtaion path to the beginning of the current list like
C:\Program Files\Java\jdk-22\bin
Click OK to save the change

Eclipse Installation:
1.Download Eclipse:
Go to the Eclipse Downloads page.
Download the Eclipse Installer for Java Developers package.
2.Run the Eclipse Installer:
Execute the downloaded installer (e.g., eclipse-inst-jre-win64.exe).
Follow the on-screen instructions.
Choose the installation folder.
3.Create a New Java Project in Eclipse:
Open Eclipse.
Go to File > New > Java Project.
Enter a project name (e.g., “MyJavaProject”) and click “Finish.”
4.Create a New Java Class:
Right-click on the src folder in the Project Explorer.
Select New > Class.
Enter a class name (e.g., “MyMainClass”) and check the option to include the public static void main(String[] args) method.
Click “Finish.”
5.Write Your Main Method:
Eclipse will generate a skeleton for your main method. Add your code inside it.
Example:
public class MyMainClass {
public static void main(String[] args) {
System.out.println("Hello, world!");
}
}
6.Run Your Program:
Right-click on your class file (MyMainClass.java) in the Project Explorer.
Select Run As > Java Application.
You’ll see the output in the Console view.

---

## 🤝 Contributing

Contributions are welcome! Here are several ways you can contribute:

- **[Submit Pull Requests](https://github.com/Pravakar-RijaI/Java_Lab/blob/main/CONTRIBUTING.md)**: Review open PRs, and submit your own PRs.
- **[Join the Discussions](https://github.com/Pravakar-RijaI/Java_Lab/discussions)**: Share your insights, provide feedback, or ask questions.
- **[Report Issues](https://github.com/Pravakar-RijaI/Java_Lab/issues)**: Submit bugs found or log feature requests for Java_lab.

<details closed>
    <summary>Contributing Guidelines</summary>

1. **Fork the Repository**: Start by forking the project repository to your GitHub account.
2. **Clone Locally**: Clone the forked repository to your local machine using a Git client.
   ```sh
   git clone https://github.com/Pravakar-RijaI/Java_Lab
   ```
3. **Create a New Branch**: Always work on a new branch, giving it a descriptive name.
   ```sh
   git checkout -b new-feature-x
   ```
4. **Make Your Changes**: Develop and test your changes locally.
5. **Commit Your Changes**: Commit with a clear message describing your updates.
   ```sh
   git commit -m 'Implemented new feature x.'
   ```
6. **Push to GitHub**: Push the changes to your forked repository.
   ```sh
   git push origin new-feature-x
   ```
7. **Submit a Pull Request**: Create a PR against the original project repository. Clearly describe the changes and their motivations.

Once your PR is reviewed and approved, it will be merged into the main branch.

</details>

---

## 👏 Acknowledgments

- Suraj Thapa Magar (Instructor)
- Friends at BMC Seventh Semester
- Teachers and Faculty Staff

[**Return**](#-quick-links)

---
