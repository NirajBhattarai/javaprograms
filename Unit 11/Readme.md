# Java AWT Overview

## Introduction

AWT, short for Abstract Window Toolkit, is Java's original platform-independent windowing, graphics, and user-interface widget toolkit. AWT is part of the Java Foundation Classes (JFC) — the standard API for providing a graphical user interface (GUI) for Java programs.

## Components

AWT defines a set of GUI components such as buttons, checkboxes, and text fields. It also includes layout managers, which allow flexible layout of GUI components.

### Basic Components:

- `Button`
- `Label`
- `TextField`
- `TextArea`
- `Checkbox`
- `Choice`
- `List`
- `Scrollbar`

### Containers:

- `Panel`
- `Canvas`
- `Window`
- `Frame`
- `Dialog`

### Layout Managers:

- `FlowLayout`
- `BorderLayout`
- `GridLayout`
- `CardLayout`
- `GridBagLayout`

## Events

AWT also provides a rich event-handling mechanism. Here are the basics:

- `ActionEvent`
- `MouseEvent`
- `KeyEvent`
- `WindowEvent`
- `ComponentEvent`
- `FocusEvent`
- `ItemEvent`

## Example Usage

Below is a simple example of a Java AWT program that creates a frame with a button.

```java
import java.awt.*;
import java.awt.event.*;

public class AWTExample extends Frame {

    public AWTExample() {
        Button b = new Button("Click Me!");
        b.setBounds(30, 100, 80, 30); // Setting Button Position
        add(b); // Adding Button to Frame
        setSize(300, 300); // Setting Frame Size
        setLayout(null); // No layout manager
        setVisible(true); // Frame visibility

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked!");
            }
        });
    }

    public static void main(String[] args) {
        new AWTExample(); // Creating instance of Frame
    }
}
```


## Limitations of AWT

While AWT is fundamental to Java GUI programming, it does have several limitations:

1. **Platform Dependency**: AWT components are rendered by the operating system's native windowing system, which leads to slight differences in appearance and behavior on different platforms.

2. **Limited Set of Widgets**: Compared to newer toolkits like Swing, AWT has a limited set of GUI components.

3. **Heavyweight Components**: AWT components are heavyweight, meaning each AWT component is a real GUI component in the native windowing system, which can lead to performance overhead.

4. **Lesser Flexibility and Customization**: Customizing AWT components can be difficult as they rely on the native windowing system, which restricts the level of control you have over their appearance and behavior.

5. **Look and Feel**: The look and feel of AWT applications is determined by the native system, making it challenging to create a uniform appearance across different platforms.

## Introduction to Swing

To address the limitations of AWT, Swing was introduced as part of Java Foundation Classes (JFC). Swing provides a richer set of components and a pluggable look-and-feel that allows applications to have a more consistent user interface across different platforms.

### Advantages of Swing over AWT:

- **Lightweight Components**: Swing components (called "Swing widgets") are less resource-intensive than AWT components as they are not mapped to native peers.

- **Pluggable Look and Feel**: Swing allows you to change the look and feel of your application at runtime, which means you can provide a consistent UI independent of the underlying platform.

- **More Powerful Components**: Swing provides more advanced components such as tables, trees, tabbed panes, sliders, and progress bars.

- **Greater Customization**: Swing components can be easily customized and extended to create complex layouts and appearances.

- **Built-In Double Buffering**: Swing supports double buffering by default, which means it eliminates flicker during re-drawing.

## Example of a Swing Application

Here's a simple example of a Java Swing application that creates a JFrame with a JButton:

```java
import javax.swing.*;
import java.awt.event.*;

public class SwingExample {

    public static void main(String[] args) {
        // Creating instance of JFrame
        JFrame frame = new JFrame("Swing Example");

        // Creating instance of JButton
        JButton button = new JButton("Click Me!");
        button.setBounds(130, 100, 100, 40);

        // Adding ActionListener to JButton
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Button Clicked!");
            }
        });

        // Adding JButton to JFrame
        frame.add(button);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
```

# JFrame: The Top-Level Container

## Overview of JFrame

JFrame is a part of javax.swing package, an extension of java.awt package. It is a top-level container used to represent the main window of a GUI application. 

## Features of JFrame

- **Window Features**: JFrame can have a title, border, and window controls. It is responsible for the window decorations and the standard window operations such as minimize, maximize, and close.

- **Content Pane**: JFrame uses a `ContentPane` to hold and manage child components, including other Swing and AWT components.

- **Menu Bar**: It can have a `JMenuBar` attached to it, which holds the main menu(s) for the application.

- **Layered Panes**: It allows stacking multiple layers on top of each other, like a `JLayeredPane` for depth management of its components.

- **Root Pane**: The `RootPane` is the base pane where all menu bars, content panes, and layered panes are attached.

- **State Management**: JFrame can control the state of the window, such as whether it is maximized or iconified.

- **Event Handling**: It can handle window events, such as opening, closing, and focusing, through `WindowListeners`.

## Using JFrame

Here is a basic example of using JFrame to create a window:

```java
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleJFrameExample {
    public static void main(String[] args) {
        // Create a new instance of JFrame
        JFrame frame = new JFrame("Simple JFrame Example");

        // Set the size of the frame
        frame.setSize(300, 200);

        // Create a JButton and add it to the frame
        JButton button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button was clicked!");
            }
        });
        frame.add(button);

        // Configure the frame to close when the close button is clicked
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display the frame
        frame.setVisible(true);
    }
}
```

## Layout Manager In Swing

# FlowLayout in Java Swing

## Overview

`FlowLayout` is a simple layout manager provided by Java Swing, which lays out components in a directional flow, much like lines of text in a paragraph. Components are arranged left-to-right (or right-to-left for some languages), and flow to a new line when there's no more room.

## Characteristics of FlowLayout

- **Sequential Placement**: Components are placed in the order they are added to the container.
- **Adjustable Alignment**: You can align components to the left, center, or right.
- **Gaps**: It allows horizontal and vertical gaps between components.
- **Responsive to Resizing**: Components reflow when the container is resized.

## Usage Example

Below is an example of how to set up a `FlowLayout` and add components to it.

```java
import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        // Setting up the frame
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Setting the layout manager to FlowLayout with center alignment
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER));

        // Adding buttons to the content pane
        contentPane.add(new JButton("Button 1"));
        contentPane.add(new JButton("Button 2"));
        contentPane.add(new JButton("Button 3"));

        // Displaying the frame
        frame.setVisible(true);
    }
}
```

# Alignments in FlowLayout

The `FlowLayout` class provides several alignment options which determine how the components are aligned within the container. Here are the possible alignment options:

- `FlowLayout.LEFT`: Aligns the components at the left edge of the container's flow layout.
- `FlowLayout.CENTER`: Centers the components within the container's flow layout.
- `FlowLayout.RIGHT`: Aligns the components at the right edge of the container's flow layout.

You can specify the alignment in the `FlowLayout` constructor. Here are some examples:

## Example of FlowLayout.LEFT

```java
setLayout(new FlowLayout(FlowLayout.LEFT));
```

# BorderLayout in Java Swing

## Overview of BorderLayout

`BorderLayout` is a layout manager that arranges components in five regions: north, south, east, west, and center. Each region can contain only one component, and each has varying behavior in terms of size and stretching:

- **North (Page Start)**: Typically used for toolbars; stretches horizontally, fixed height.
- **South (Page End)**: Typically used for status bars; stretches horizontally, fixed height.
- **East (Line End)**: Stretches vertically, fixed width.
- **West (Line Start)**: Stretches vertically, fixed width.
- **Center**: Occupies all remaining space; stretches both horizontally and vertically.

Components added to the `BorderLayout` are expanded to fill the region they are assigned to. The `Center` region will expand to fill any space left over from the other four regions.

## Using BorderLayout

When using `BorderLayout`, it is important to add components to one of the five specific regions. Here is a simple example of using `BorderLayout` in a Java Swing application:

```java
import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        // Setting up the JFrame
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Creating the BorderLayout manager with horizontal gap 10 and vertical gap 20
        frame.setLayout(new BorderLayout(10, 20));

        // Adding components to the different regions
        frame.add(new JButton("North"), BorderLayout.NORTH);
        frame.add(new JButton("South"), BorderLayout.SOUTH);
        frame.add(new JButton("East"), BorderLayout.EAST);
        frame.add(new JButton("West"), BorderLayout.WEST);
        frame.add(new JTextArea("Center Area"), BorderLayout.CENTER);

        // Display the frame
        frame.setVisible(true);
    }
}
```

```

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class BorderLayoutWithGaps {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout with Gaps Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 250);

        // Create BorderLayout with horizontal gap of 10 and vertical gap of 15
        BorderLayout layout = new BorderLayout(10, 15);
        frame.setLayout(layout);

        // Add buttons to the regions
        frame.add(new JButton("North"), BorderLayout.NORTH);
        frame.add(new JButton("South"), BorderLayout.SOUTH);
        frame.add(new JButton("East"), BorderLayout.EAST);
        frame.add(new JButton("West"), BorderLayout.WEST);
        frame.add(new JButton("Center"), BorderLayout.CENTER);

        // Display the frame
        frame.setVisible(true);
    }
}
```

# GridLayout in Java Swing

## Overview of GridLayout

`GridLayout` is a layout manager that lays out a container's components in a rectangular grid. The container is divided into equal-sized rectangles, and one component is placed in each rectangle.

## Characteristics of GridLayout

- Components in a grid are all given the same size.
- Components are added to the grid in the order they are added to the container, filling up rows from left to right, then top to bottom.
- The number of rows and columns can be specified, with the constructor allowing the grid to be defined by either the number of rows or the number of columns. If one (but not both) is set to zero, that dimension is set to any length -- that is, if the number of rows is set to zero, the number of rows in the grid is determined by the total number of components and the specified number of columns.

## Using GridLayout

To use `GridLayout`, instantiate it and set it as the layout manager for a container, and then add components to the container. Here's an example of how to use `GridLayout`:

```java
import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        // Create a new JFrame container with the title "GridLayout Example".
        JFrame frame = new JFrame("GridLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // Set the layout manager to a new instance of GridLayout.
        // This GridLayout has 3 rows and 2 columns.
        frame.setLayout(new GridLayout(3, 2));

        // Add six buttons to the frame.
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
        frame.add(new JButton("Button 5"));
        frame.add(new JButton("Button 6"));

        // Pack the frame to its subcomponents' preferred sizes.
        frame.pack();

        // Make the frame visible on the screen.
        frame.setVisible(true);
    }
}
```

# Setting Gaps in GridLayout

`GridLayout` simplifies component organization in a grid but can sometimes result in a packed interface where components are squeezed together. Introducing gaps between these components can enhance usability and aesthetics. Below is a guide on incorporating horizontal and vertical gaps within a `GridLayout`.

## Syntax for Specifying Gaps

The `GridLayout` constructor allows the inclusion of gap specifications:

```java
GridLayout(int rows, int cols, int hgap, int vgap)
```


```
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;

public class GridLayoutGapsExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout with Gaps Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 250);

        // Instantiate GridLayout with gaps: 10 pixels horizontal, 20 pixels vertical.
        GridLayout layout = new GridLayout(3, 2, 10, 20);
        frame.setLayout(layout);

        // Populate frame with buttons to illustrate the grid and gaps.
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
        frame.add(new JButton("Button 5"));
        frame.add(new JButton("Button 6"));

        // Make the frame visible
        frame.setVisible(true);
    }
}
```

# Implementing Gaps in GridLayout

`GridLayout` organizes components in a grid with specified rows and columns, allowing you to define gaps between these components. These gaps provide necessary spacing to improve the layout's visual appeal and readability.

## Parameters

- `rows`: The number of grid rows. This determines the vertical distribution of components.
- `cols`: The number of grid columns. This determines the horizontal distribution of components.
- `hgap`: The horizontal gap between components, measured in pixels. This gap is applied between columns.
- `vgap`: The vertical gap between components, measured in pixels. This gap is applied between rows.

## Example: Setting Horizontal and Vertical Gaps

This example demonstrates how to apply horizontal (`hgap`) and vertical (`vgap`) gaps within a `GridLayout`.

```java
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;

public class GridLayoutGapsExample {
    public static void main(String[] args) {
        // Creating the JFrame window with a title
        JFrame frame = new JFrame("GridLayout Gaps Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Configuring GridLayout with specified rows, columns, and gaps
        GridLayout grid = new GridLayout(2, 3, 10, 15); // 2 rows, 3 columns, 10 pixels hgap, 15 pixels vgap
        frame.setLayout(grid);

        // Adding buttons to demonstrate the grid layout with gaps
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
        frame.add(new JButton("Button 5"));
        frame.add(new JButton("Button 6"));

        // Adjusting the frame size and making it visible
        frame.pack();
        frame.setVisible(true);
    }
}
```

# Using JPanel in Java Swing

## Overview of JPanel

`JPanel` is a lightweight container that provides space where an application can attach any other component, including other panels. It is one of the most commonly used containers in Swing applications due to its versatility and simplicity.

## Key Features of JPanel

- **Flexibility**: `JPanel` can host a variety of other components, from simple UI elements like buttons and labels to complex custom widgets.
- **Customizability**: It supports various layout managers to control the placement and sizing of its child components, making it a versatile choice for UI design.
- **Extendability**: Developers can extend `JPanel` to create complex components or panels with specific behavior.

## Why JPanel is Important

1. **Organizational Structure**: `JPanel` helps in organizing components into logical groupings, enhancing code readability and maintainability.
2. **Layout Management**: It facilitates the use of different layout managers to design sophisticated and responsive UIs.
3. **Reusability**: By encapsulating specific functionalities within a panel, developers can reuse the component in different parts of the application or in different projects.
4. **Aesthetics**: `JPanel` can be customized to improve the application's look and feel through borders, background colors, or even custom painting.

## Example: Using JPanel

Here's a simple example illustrating how to use `JPanel` within a Java Swing application:

```java
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class JPanelExample {
    public static void main(String[] args) {
        // Creating the JFrame window
        JFrame frame = new JFrame("JPanel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Creating a JPanel with a BorderLayout manager
        JPanel panel = new JPanel(new BorderLayout());

        // Adding a button to the panel
        panel.add(new JButton("Press Me"), BorderLayout.CENTER);

        // Adding the panel to the frame's content pane
        frame.getContentPane().add(panel);

        // Displaying the window
        frame.setVisible(true);
    }
}
```

# Common Swing Components

Swing provides a rich set of components for building graphical user interfaces. Below is an overview of some fundamental Swing components:

## Button (`JButton`)

- **Description**: A `JButton` triggers an action when clicked by the user.
- **Usage**: Commonly used for submitting forms, initiating actions, etc.
- **Example**: `JButton button = new JButton("Click Me!");`

## Label (`JLabel`)

- **Description**: A `JLabel` displays a short string or an image icon. Labels are not interactive.
- **Usage**: Often used to label other components or provide short instructions.
- **Example**: `JLabel label = new JLabel("Enter your name:");`

## TextField (`JTextField`)

- **Description**: A `JTextField` allows for the editing of a single line of text.
- **Usage**: Commonly used to gather input from the user.
- **Example**: `JTextField textField = new JTextField("Type here");`

## TextArea (`JTextArea`)

- **Description**: A `JTextArea` provides a multi-line area to display or edit text.
- **Usage**: Useful for gathering or displaying larger amounts of text.
- **Example**: `JTextArea textArea = new JTextArea("Enter your address");`

## Checkbox (`JCheckBox`)

- **Description**: A `JCheckBox` allows the user to select or deselect an option.
- **Usage**: Ideal for presenting options where the user can select multiple choices.
- **Example**: `JCheckBox checkBox = new JCheckBox("Accept Terms");`

## Choice (`JComboBox`)

- **Description**: A `JComboBox` shows a drop-down list of choices and allows the user to select one.
- **Usage**: Useful for selection when space is limited and the list of options is long.
- **Example**: `JComboBox<String> comboBox = new JComboBox<>(new String[]{"Option 1", "Option 2"});`

## List (`JList`)

- **Description**: A `JList` displays a list of choices and allows the user to select one or more.
- **Usage**: Suitable for displaying a collection of items where selection is required.
- **Example**: `JList<String> list = new JList<>(new String[]{"Item 1", "Item 2"});`

## Scrollbar (`JScrollBar`)

- **Description**: A `JScrollBar` provides a way to scroll through a range of values by moving the slider knob.
- **Usage**: Commonly used with large viewing areas like texts, images, or tables.
- **Example**: `JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL);`

These components are the building blocks for creating interactive and user-friendly GUIs in Java Swing applications.

# Example Using Common Swing Components

The following Java program demonstrates how to integrate various Swing components (`JButton`, `JLabel`, `JTextField`, `JTextArea`, `JCheckBox`, `JComboBox`, `JList`, and `JScrollBar`) into a single user interface.

```java
import javax.swing.*;
import java.awt.*;

public class SwingComponentsExample {
    public static void main(String[] args) {
        // Setting up the JFrame
        JFrame frame = new JFrame("Swing Components Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Creating and adding a JLabel
        JLabel label = new JLabel("Name:");
        frame.add(label);

        // Creating and adding a JTextField
        JTextField textField = new JTextField(20);
        frame.add(textField);

        // Creating and adding a JButton
        JButton button = new JButton("Submit");
        frame.add(button);

        // Creating and adding a JTextArea
        JTextArea textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea); // Adding scroll pane to text area
        frame.add(scrollPane);

        // Creating and adding a JCheckBox
        JCheckBox checkBox = new JCheckBox("Subscribe to newsletter");
        frame.add(checkBox);

        // Creating and adding a JComboBox
        String[] options = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        frame.add(comboBox);

        // Creating and adding a JList
        String[] items = {"Item 1", "Item 2", "Item 3"};
        JList<String> list = new JList<>(items);
        frame.add(new JScrollPane(list)); // Adding scroll pane to list

        // Creating and adding a JScrollBar
        JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 100);
        frame.add(scrollBar);

        // Adjusting frame size and making it visible
        frame.setSize(300, 400);
        frame.setVisible(true);
    }
}
```