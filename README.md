# ☕ Practise2026 — Java Mastery & DSA Journey

> A disciplined, hands-on repository for mastering **Java 21**, **Data Structures & Algorithms**, and **System Design Foundations** through daily practice.

<p align="center">
  <img src="https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=java&logoColor=white" />
  <img src="https://img.shields.io/badge/IntelliJ-IDEA-000000?style=for-the-badge&logo=intellij-idea&logoColor=white" />
  <img src="https://img.shields.io/badge/DSA-Daily-green?style=for-the-badge" />
  <img src="https://img.shields.io/badge/LeetCode-Practice-yellow?style=for-the-badge&logo=leetcode&logoColor=black" />
  <img src="https://img.shields.io/badge/Status-Active-brightgreen?style=for-the-badge" />
</p>

---

## 📌 Table of Contents

- [About](#-about)
- [Tech Stack](#-tech-stack)
- [Repository Structure](#-repository-structure)
- [Topics Covered](#-topics-covered)
- [Progress Tracker](#-progress-tracker)
- [How to Run](#-how-to-run)
- [Key Takeaways](#-key-takeaways)
- [Roadmap](#-roadmap)

---

## 🎯 About

**Practise2026** is my personal **Java learning workbook** and **interview preparation hub**. It contains **200+ self-contained Java files** organized by topic, each independently runnable for quick experimentation and review.

This isn't a production app — it's a **living document of my growth** as a Java developer, from core syntax to solving LeetCode problems and mastering Stream API.

### Why This Repo?
- 📝 **Daily DSA practice** with dated commits
- 🧪 **Experimentation-first** — every concept tested in isolation
- 📚 **Interview-ready** — organized by month and topic for revision
- 🚀 **Java 21** with preview features enabled

---

## 🛠 Tech Stack

| Technology | Version / Details |
|------------|-------------------|
| **Language** | Java 21 |
| **IDE** | IntelliJ IDEA |
| **Build** | IntelliJ Internal (no Maven/Gradle) |
| **Features** | Lambdas, Streams, Generics, Preview Features |
| **VCS** | Git → [PractiseCode2026](https://github.com/praj031/PractiseCode2026) |

---

## 📂 Repository Structure

```
Practise2026/
├── src/
│   ├── Main.java                          # Entry point
│   ├── DSA/
│   │   ├── LeetCode/                      # 51 daily LeetCode problems
│   │   ├── Strings/                       # 23 string manipulation drills
│   │   └── Striver_DSA/                   # Striver DSA sheet solutions
│   ├── Java8features/
│   │   ├── StreamAPIQuestions/            # 44 Stream API exercises
│   │   └── Lambda demos                   # Functional interfaces & lambdas
│   ├── InterviewPractice/
│   │   ├── December/                      # 13 foundational problems
│   │   ├── January2026/                   # 25 interview prep problems
│   │   ├── Febuary2026/                   # Ongoing...
│   │   └── March/                         # Ongoing...
│   ├── OOPS/
│   │   ├── Inheritance/                   # Animal hierarchy
│   │   └── Polymorphisam/                 # Method overloading demos
│   ├── CarDelership/                      # OOP mini-project (car purchase simulation)
│   ├── Collections/                       # ArrayList, HashSet practice
│   ├── HashMap/                           # HashMap, LinkedHashMap, TreeMap
│   ├── JavGenericsAndWrapperClass/        # Generics & autoboxing
│   ├── TimeAndSpaceComplexity/            # Complexity demonstrations
│   └── fileHandleing/                     # File I/O & exception handling
├── out/                                   # Compiled output
└── .idea/                                 # IntelliJ configuration
```

> 💡 Each folder is self-contained. Pick any `.java` file and run it independently!

---

## 📚 Topics Covered

### 1. 🧠 Data Structures & Algorithms
- **Arrays**: Rotations, two-sum variants, set bits, unique elements
- **Strings**: Traversal, reversal, palindrome checks, anagrams, space counting
- **Matrix**: Set matrix zeroes, boundary traversal
- **Problem Sources**: LeetCode, Striver DSA Sheet, GeeksforGeeks

### 2. ☕ Core Java
- **OOP**: Inheritance, Polymorphism, Encapsulation, Abstraction
- **Collections**: `ArrayList`, `HashSet`, `HashMap`, `LinkedHashMap`, `TreeMap`
- **Generics**: Generic methods, generic classes (`Box<T>`, `Dog<ID,NAME>`)
- **Wrapper Classes**: Autoboxing & unboxing
- **File I/O**: `Scanner`, `FileReader`, exception handling

### 3. ⚡ Java 8+ Features
- **Lambda Expressions**: Syntax, functional interfaces
- **Stream API**: Filtering, mapping, reducing, `forEach`, `collect`
- **Default Methods**: Interface evolution & conflict resolution
- **Method References**: Constructor & static references

### 4. 🎯 Interview Practice
- Month-wise organized problems (Dec 2025 → Mar 2026)
- Foundational algorithms: sorting, searching, basic math
- Progressive difficulty: Easy → Medium

---

## 📈 Progress Tracker

| Month | Problems Solved | Focus Area |
|-------|----------------|------------|
| **December 2025** | 13 | Core Java basics |
| **January 2026** | 25 | Arrays & basic DSA |
| **February 2026** | 1+ | Strings & collections |
| **March 2026** | 4+ | LeetCode mediums |
| **Ongoing (Apr–Jun)** | 43+ | Daily LeetCode + Stream API |

> 🔥 **Total Files**: 200+ Java classes and growing daily!

---

## 🚀 How to Run

### Prerequisites
- Java 21 JDK installed
- IntelliJ IDEA (recommended) or any Java IDE

### Steps
1. **Clone the repository**
   ```bash
   git clone https://github.com/praj031/PractiseCode2026.git
   cd PractiseCode2026
   ```

2. **Open in IntelliJ IDEA**
   - File → Open → Select `Practise2026` folder
   - IntelliJ will auto-detect `src/` as source root

3. **Run any file**
   - Navigate to any `.java` file
   - Click the green ▶️ play button next to `main()`
   - Or right-click → `Run 'ClassName.main()'`

> ⚠️ Note: This project uses IntelliJ's internal build system (no Maven/Gradle required).

---

## 💡 Key Takeaways

### What I've Learned So Far
- ✅ **Java 21 fundamentals** — strong grasp of syntax, OOP, and collections
- ✅ **Functional programming** — fluent in lambdas, streams, and method references
- ✅ **DSA foundations** — comfortable with arrays, strings, and basic algorithms
- ✅ **Problem decomposition** — breaking LeetCode problems into manageable steps
- ✅ **Consistent practice** — daily coding habit with 80+ commits

### Code Style
- 🔄 Each class is **independently executable** for quick testing
- 📝 Heavy inline comments in complex DSA solutions for revision
- 🏷️ Files named by topic + date (e.g., `DSA_43_04_June.java`)

---

## 🗺 Roadmap

- [ ] Complete Striver DSA Sheet (A-Z)
- [ ] Add JUnit tests for core utilities
- [ ] Migrate to Maven/Gradle for dependency management
- [ ] Solve 100+ LeetCode problems
- [ ] Explore Multithreading & Concurrency
- [ ] Learn Design Patterns and apply them
- [ ] Build a mini project with Spring Boot

---

## 🤝 Connect

If you're also on a Java/DSA learning journey, feel free to:
- ⭐ Star this repo if you find it useful
- 🍴 Fork it for your own practice
- 💬 Share tips or suggest better approaches

> *"The only way to learn a new programming language is by writing programs in it."* — Dennis Ritchie

---

<p align="center">
  <b>Built with discipline, coffee ☕, and a lot of <code>System.out.println()</code></b>
</p>

<p align="center">
  <img src="https://img.shields.io/github/last-commit/praj031/PractiseCode2026?style=flat-square" />
  <img src="https://img.shields.io/github/commit-activity/w/praj031/PractiseCode2026?style=flat-square" />
</p>
