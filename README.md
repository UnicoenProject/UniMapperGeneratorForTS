# UniMapperGeneratorForTS

Requirements
---

* [Eclipse](https://eclipse.org/) (Tested with 4.7.3 Oxygen) 
* [Xtext & Xtend](http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/) (Tested with 2.15.0) 
* [Node.js 8.2.0+](https://nodejs.org/ja/)
  * npm(5.2.0+)

How to Develop
---

### 1. Install Xtext & Xtend
* Visit [download page](http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/) in Xtext web site
* Follow the [Installation Instructions]
  1. right click **[Release]** button & copy the link 
  1. Open Eclipse
  1. Choose "help" -> "install new software" in the menu
  1. Insert the copied URL
  1. Check the check boxes of Xtext and Xtend and press install button
  1. Restart eclipse & wait for workspace building

### 2. Import UniMapperGenerator
1. Clone [UniMapperGeneratorForTS](https://github.com/UnicoenProject/UniMapperGeneratorForTS).
2. Choose "File" -> "Import" in the menu
3. Choose "General" -> "projects from workspace" in the window
4. Import 5 projects that starts with "net.unicoen"
    + net.unicoen
    + net.unicoen.ide
    + net.unicoen.tests
    + net.unicoen.ui
    + net.unicoen.ui.tests
5. Right click the net.unicoen/src/net.unicoen/GeneratorUniMapperGenerator.mwe2 in Package Explorer
6. Select "Run as" -> "MWE2 Workflow"

### 3. Execute UniMapperGenerator
1. Select net.unicoen and "Run as" -> "Eclipse Application (Launch Runtime Eclipse)"
2. Import "UniMapperGenerator" in the root directory
3. Edit the (language).ug4 files in src/
4. Then, (language).g4, (language)Parser.ts, (language)Lexer.ts, (language)Visitor.ts, and (language)Mapper.ts are generated!

Related Works
---
- [unicoen.ts](https://github.com/UnicoenProject/unicoen.ts)

How to Learn
---
- Xtext
  - https://eclipse.org/Xtext/documentation/102_domainmodelwalkthrough.html
  - https://eclipse.org/Xtext/documentation/103_domainmodelnextsteps.html
  - https://eclipse.org/Xtext/documentation/104_jvmdomainmodel.html
