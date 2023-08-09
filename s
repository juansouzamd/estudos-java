[33mcommit 1264725136c1271967eab813cf12973c40657bce[m[33m ([m[1;36mHEAD -> [m[1;32mmaster[m[33m, [m[1;31morigin/master[m[33m)[m
Author: juansouzamd <juansouzamd@gmail.com>
Date:   Tue Aug 8 12:14:39 2023 -0300

    Initial commit

[1mdiff --git a/.gitignore b/.gitignore[m
[1mnew file mode 100644[m
[1mindex 0000000..f68d109[m
[1m--- /dev/null[m
[1m+++ b/.gitignore[m
[36m@@ -0,0 +1,29 @@[m
[32m+[m[32m### IntelliJ IDEA ###[m
[32m+[m[32mout/[m
[32m+[m[32m!**/src/main/**/out/[m
[32m+[m[32m!**/src/test/**/out/[m
[32m+[m
[32m+[m[32m### Eclipse ###[m
[32m+[m[32m.apt_generated[m
[32m+[m[32m.classpath[m
[32m+[m[32m.factorypath[m
[32m+[m[32m.project[m
[32m+[m[32m.settings[m
[32m+[m[32m.springBeans[m
[32m+[m[32m.sts4-cache[m
[32m+[m[32mbin/[m
[32m+[m[32m!**/src/main/**/bin/[m
[32m+[m[32m!**/src/test/**/bin/[m
[32m+[m
[32m+[m[32m### NetBeans ###[m
[32m+[m[32m/nbproject/private/[m
[32m+[m[32m/nbbuild/[m
[32m+[m[32m/dist/[m
[32m+[m[32m/nbdist/[m
[32m+[m[32m/.nb-gradle/[m
[32m+[m
[32m+[m[32m### VS Code ###[m
[32m+[m[32m.vscode/[m
[32m+[m
[32m+[m[32m### Mac OS ###[m
[32m+[m[32m.DS_Store[m
\ No newline at end of file[m
[1mdiff --git a/.idea/.gitignore b/.idea/.gitignore[m
[1mnew file mode 100644[m
[1mindex 0000000..26d3352[m
[1m--- /dev/null[m
[1m+++ b/.idea/.gitignore[m
[36m@@ -0,0 +1,3 @@[m
[32m+[m[32m# Default ignored files[m
[32m+[m[32m/shelf/[m
[32m+[m[32m/workspace.xml[m
[1mdiff --git a/.idea/codeStyles/codeStyleConfig.xml b/.idea/codeStyles/codeStyleConfig.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..a55e7a1[m
[1m--- /dev/null[m
[1m+++ b/.idea/codeStyles/codeStyleConfig.xml[m
[36m@@ -0,0 +1,5 @@[m
[32m+[m[32m<component name="ProjectCodeStyleConfiguration">[m
[32m+[m[32m  <state>[m
[32m+[m[32m    <option name="PREFERRED_PROJECT_CODE_STYLE" value="Default" />[m
[32m+[m[32m  </state>[m
[32m+[m[32m</component>[m
\ No newline at end of file[m
[1mdiff --git a/.idea/dictionaries/juan_.xml b/.idea/dictionaries/juan_.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..19a0ef1[m
[1m--- /dev/null[m
[1m+++ b/.idea/dictionaries/juan_.xml[m
[36m@@ -0,0 +1,3 @@[m
[32m+[m[32m<component name="ProjectDictionaryState">[m
[32m+[m[32m  <dictionary name="juan_" />[m
[32m+[m[32m</component>[m
\ No newline at end of file[m
[1mdiff --git a/.idea/discord.xml b/.idea/discord.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..8cf359d[m
[1m--- /dev/null[m
[1m+++ b/.idea/discord.xml[m
[36m@@ -0,0 +1,7 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<project version="4">[m
[32m+[m[32m  <component name="DiscordProjectSettings">[m
[32m+[m[32m    <option name="show" value="PROJECT" />[m
[32m+[m[32m    <option name="description" value="" />[m
[32m+[m[32m  </component>[m
[32m+[m[32m</project>[m
\ No newline at end of file[m
[1mdiff --git a/.idea/inspectionProfiles/Project_Default.xml b/.idea/inspectionProfiles/Project_Default.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..146ab09[m
[1m--- /dev/null[m
[1m+++ b/.idea/inspectionProfiles/Project_Default.xml[m
[36m@@ -0,0 +1,10 @@[m
[32m+[m[32m<component name="InspectionProjectProfileManager">[m
[32m+[m[32m  <profile version="1.0">[m
[32m+[m[32m    <option name="myName" value="Project Default" />[m
[32m+[m[32m    <inspection_tool class="SpellCheckingInspection" enabled="false" level="TYPO" enabled_by_default="false">[m
[32m+[m[32m      <option name="processCode" value="true" />[m
[32m+[m[32m      <option name="processLiterals" value="true" />[m
[32m+[m[32m      <option name="processComments" value="true" />[m
[32m+[m[32m    </inspection_tool>[m
[32m+[m[32m  </profile>[m
[32m+[m[32m</component>[m
\ No newline at end of file[m
[1mdiff --git a/.idea/misc.xml b/.idea/misc.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..b6087ad[m
[1m--- /dev/null[m
[1m+++ b/.idea/misc.xml[m
[36m@@ -0,0 +1,6 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<project version="4">[m
[32m+[m[32m  <component name="ProjectRootManager" version="2" languageLevel="JDK_17" default="true" project-jdk-name="17 (2)" project-jdk-type="JavaSDK">[m
[32m+[m[32m    <output url="file://$PROJECT_DIR$/out" />[m
[32m+[m[32m  </component>[m
[32m+[m[32m</project>[m
\ No newline at end of file[m
[1mdiff --git a/.idea/modules.xml b/.idea/modules.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..d636f96[m
[1m--- /dev/null[m
[1m+++ b/.idea/modules.xml[m
[36m@@ -0,0 +1,8 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<project version="4">[m
[32m+[m[32m  <component name="ProjectModuleManager">[m
[32m+[m[32m    <modules>[m
[32m+[m[32m      <module fileurl="file://$PROJECT_DIR$/estudos-java.iml" filepath="$PROJECT_DIR$/estudos-java.iml" />[m
[32m+[m[32m    </modules>[m
[32m+[m[32m  </component>[m
[32m+[m[32m</project>[m
\ No newline at end of file[m
[1mdiff --git a/.idea/uiDesigner.xml b/.idea/uiDesigner.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..2b63946[m
[1m--- /dev/null[m
[1m+++ b/.idea/uiDesigner.xml[m
[36m@@ -0,0 +1,124 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<project version="4">[m
[32m+[m[32m  <component name="Palette2">[m
[32m+[m[32m    <group name="Swing">[m
[32m+[m[32m      <item class="com.intellij.uiDesigner.HSpacer" tooltip-text="Horizontal Spacer" icon="/com/intellij/uiDesigner/icons/hspacer.svg" removable="false" auto-create-binding="false" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="1" hsize-policy="6" anchor="0" fill="1" />[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="com.intellij.uiDesigner.VSpacer" tooltip-text="Vertical Spacer" icon="/com/intellij/uiDesigner/icons/vspacer.svg" removable="false" auto-create-binding="false" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="6" hsize-policy="1" anchor="0" fill="2" />[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JPanel" icon="/com/intellij/uiDesigner/icons/panel.svg" removable="false" auto-create-binding="false" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="3" hsize-policy="3" anchor="0" fill="3" />[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JScrollPane" icon="/com/intellij/uiDesigner/icons/scrollPane.svg" removable="false" auto-create-binding="false" can-attach-label="true">[m
[32m+[m[32m        <default-constraints vsize-policy="7" hsize-policy="7" anchor="0" fill="3" />[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JButton" icon="/com/intellij/uiDesigner/icons/button.svg" removable="false" auto-create-binding="true" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="3" anchor="0" fill="1" />[m
[32m+[m[32m        <initial-values>[m
[32m+[m[32m          <property name="text" value="Button" />[m
[32m+[m[32m        </initial-values>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JRadioButton" icon="/com/intellij/uiDesigner/icons/radioButton.svg" removable="false" auto-create-binding="true" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="3" anchor="8" fill="0" />[m
[32m+[m[32m        <initial-values>[m
[32m+[m[32m          <property name="text" value="RadioButton" />[m
[32m+[m[32m        </initial-values>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JCheckBox" icon="/com/intellij/uiDesigner/icons/checkBox.svg" removable="false" auto-create-binding="true" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="3" anchor="8" fill="0" />[m
[32m+[m[32m        <initial-values>[m
[32m+[m[32m          <property name="text" value="CheckBox" />[m
[32m+[m[32m        </initial-values>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JLabel" icon="/com/intellij/uiDesigner/icons/label.svg" removable="false" auto-create-binding="false" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="0" anchor="8" fill="0" />[m
[32m+[m[32m        <initial-values>[m
[32m+[m[32m          <property name="text" value="Label" />[m
[32m+[m[32m        </initial-values>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JTextField" icon="/com/intellij/uiDesigner/icons/textField.svg" removable="false" auto-create-binding="true" can-attach-label="true">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1">[m
[32m+[m[32m          <preferred-size width="150" height="-1" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JPasswordField" icon="/com/intellij/uiDesigner/icons/passwordField.svg" removable="false" auto-create-binding="true" can-attach-label="true">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1">[m
[32m+[m[32m          <preferred-size width="150" height="-1" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JFormattedTextField" icon="/com/intellij/uiDesigner/icons/formattedTextField.svg" removable="false" auto-create-binding="true" can-attach-label="true">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1">[m
[32m+[m[32m          <preferred-size width="150" height="-1" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JTextArea" icon="/com/intellij/uiDesigner/icons/textArea.svg" removable="false" auto-create-binding="true" can-attach-label="true">[m
[32m+[m[32m        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">[m
[32m+[m[32m          <preferred-size width="150" height="50" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JTextPane" icon="/com/intellij/uiDesigner/icons/textPane.svg" removable="false" auto-create-binding="true" can-attach-label="true">[m
[32m+[m[32m        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">[m
[32m+[m[32m          <preferred-size width="150" height="50" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JEditorPane" icon="/com/intellij/uiDesigner/icons/editorPane.svg" removable="false" auto-create-binding="true" can-attach-label="true">[m
[32m+[m[32m        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">[m
[32m+[m[32m          <preferred-size width="150" height="50" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JComboBox" icon="/com/intellij/uiDesigner/icons/comboBox.svg" removable="false" auto-create-binding="true" can-attach-label="true">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="2" anchor="8" fill="1" />[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JTable" icon="/com/intellij/uiDesigner/icons/table.svg" removable="false" auto-create-binding="true" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">[m
[32m+[m[32m          <preferred-size width="150" height="50" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JList" icon="/com/intellij/uiDesigner/icons/list.svg" removable="false" auto-create-binding="true" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="6" hsize-policy="2" anchor="0" fill="3">[m
[32m+[m[32m          <preferred-size width="150" height="50" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JTree" icon="/com/intellij/uiDesigner/icons/tree.svg" removable="false" auto-create-binding="true" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">[m
[32m+[m[32m          <preferred-size width="150" height="50" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JTabbedPane" icon="/com/intellij/uiDesigner/icons/tabbedPane.svg" removable="false" auto-create-binding="true" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="3" hsize-policy="3" anchor="0" fill="3">[m
[32m+[m[32m          <preferred-size width="200" height="200" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JSplitPane" icon="/com/intellij/uiDesigner/icons/splitPane.svg" removable="false" auto-create-binding="false" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="3" hsize-policy="3" anchor="0" fill="3">[m
[32m+[m[32m          <preferred-size width="200" height="200" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JSpinner" icon="/com/intellij/uiDesigner/icons/spinner.svg" removable="false" auto-create-binding="true" can-attach-label="true">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1" />[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JSlider" icon="/com/intellij/uiDesigner/icons/slider.svg" removable="false" auto-create-binding="true" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1" />[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JSeparator" icon="/com/intellij/uiDesigner/icons/separator.svg" removable="false" auto-create-binding="false" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3" />[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JProgressBar" icon="/com/intellij/uiDesigner/icons/progressbar.svg" removable="false" auto-create-binding="true" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="6" anchor="0" fill="1" />[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JToolBar" icon="/com/intellij/uiDesigner/icons/toolbar.svg" removable="false" auto-create-binding="false" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="6" anchor="0" fill="1">[m
[32m+[m[32m          <preferred-size width="-1" height="20" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JToolBar$Separator" icon="/com/intellij/uiDesigner/icons/toolbarSeparator.svg" removable="false" auto-create-binding="false" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="0" anchor="0" fill="1" />[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JScrollBar" icon="/com/intellij/uiDesigner/icons/scrollbar.svg" removable="false" auto-create-binding="true" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="6" hsize-policy="0" anchor="0" fill="2" />[m
[32m+[m[32m      </item>[m
[32m+[m[32m    </group>[m
[32m+[m[32m  </component>[m
[32m+[m[32m</project>[m
\ No newline at end of file[m
[1mdiff --git a/estudos-java.iml b/estudos-java.iml[m
[1mnew file mode 100644[m
[1mindex 0000000..c90834f[m
[1m--- /dev/null[m
[1m+++ b/estudos-java.iml[m
[36m@@ -0,0 +1,11 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<module type="JAVA_MODULE" version="4">[m
[32m+[m[32m  <component name="NewModuleRootManager" inherit-compiler-output="true">[m
[32m+[m[32m    <exclude-output />[m
[32m+[m[32m    <content url="file://$MODULE_DIR$">[m
[32m+[m[32m      <sourceFolder url="file://$MODULE_DIR$/src" isTestSource="false" />[m
[32m+[m[32m    </content>[m
[32m+[m[32m    <orderEntry type="inheritedJdk" />[m
[32m+[m[32m    <orderEntry type="sourceFolder" forTests="false" />[m
[32m+[m[32m  </component>[m
[32m+[m[32m</module>[m
\ No newline at end of file[m
[1mdiff --git a/src/collections/comparableXcomparator/Livro.java b/src/collections/comparableXcomparator/Livro.java[m
[1mnew file mode 100644[m
[1mindex 0000000..e93d994[m
[1m--- /dev/null[m
[1m+++ b/src/collections/comparableXcomparator/Livro.java[m
[36m@@ -0,0 +1,68 @@[m
[32m+[m[32mpackage collections.comparableXcomparator;[m
[32m+[m
[32m+[m[32mimport java.util.Comparator;[m
[32m+[m
[32m+[m[32m// Uma classe 'Livro' que implementa Comparable[m
[32m+[m[32mclass Livro implements Comparable<Livro> {[m
[32m+[m[32m    private String titulo;[m
[32m+[m[32m    private String autor;[m
[32m+[m[32m    private int ano;[m
[32m+[m
[32m+[m[32m    // Construtor[m
[32m+[m[32m    public Livro(String ti, String au, int an) {[m
[32m+[m[32m        this.titulo = ti;[m
[32m+[m[32m        this.autor = au;[m
[32m+[m[32m        this.ano = an;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    // Usado para ordenar livros por ano[m
[32m+[m[32m    public int compareTo(Livro l) {[m
[32m+[m[32m        return titulo.compareTo(l.titulo);[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    // Métodos getters para acessar os dados privados[m
[32m+[m[32m    public String getTitulo() {[m
[32m+[m[32m        return titulo;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public String getAutor() {[m
[32m+[m[32m        return autor;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public int getAno() {[m
[32m+[m[32m        return ano;[m
[32m+[m[32m    }[m
[32m+[m[32m}[m
[32m+[m
[32m+[m[32m// Classe para comparar Livro por autor[m
[32m+[m[32mclass CompararAutor implements Comparator<Livro> {[m
[32m+[m[32m    public int compare(Livro l1, Livro l2) {[m
[32m+[m[32m        return l1.getAutor().compareTo(l2.getAutor());[m
[32m+[m[32m    }[m
[32m+[m[32m}[m
[32m+[m
[32m+[m[32m// Classe para comparar Livro por ano[m
[32m+[m[32mclass CompararAno implements Comparator<Livro> {[m
[32m+[m[32m    public int compare(Livro l1, Livro l2) {[m
[32m+[m[32m        if (l1.getAno() < l2.getAno())[m
[32m+[m[32m            return -1;[m
[32m+[m[32m        if (l1.getAno() > l2.getAno())[m
[32m+[m[32m            return 1;[m
[32m+[m[32m        else[m
[32m+[m[32m            return 0;[m
[32m+[m[32m    }[m
[32m+[m[32m}[m
[32m+[m
[32m+[m[32mclass CompararAnoAutorTitulo implements Comparator<Livro> {[m
[32m+[m
[32m+[m[32m    @Override[m
[32m+[m[32m    public int compare(Livro l1, Livro l2) {[m
[32m+[m[32m        int ano = Integer.compare(l1.getAno(), l2.getAno());[m
[32m+[m[32m        if (ano != 0)[m
[32m+[m[32m            return ano;[m
[32m+[m[32m        int autor = l1.getAutor().compareTo(l2.getAutor());[m
[32m+[m[32m        if (autor != 0)[m
[32m+[m[32m            return autor;[m
[32m+[m[32m        return l1.getTitulo().compareTo(l2.getTitulo());[m
[32m+[m[32m    }[m
[32m+[m[32m}[m
[1mdiff --git a/src/collections/comparableXcomparator/Main.java b/src/collections/comparableXcomparator/Main.java[m
[1mnew file mode 100644[m
[1mindex 0000000..e718be6[m
[1m--- /dev/null[m
[1m+++ b/src/collections/comparableXcomparator/Main.java[m
[36m@@ -0,0 +1,62 @@[m
[32m+[m[32mpackage collections.comparableXcomparator;[m
[32m+[m
[32m+[m[32mim