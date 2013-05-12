/*
 * griffon-dialogs: Dialog provider Griffon plugin
 * Copyright 2010 and beyond, Andres Almiray
 *
 * griffon-dialogs is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */
 
/**
 * @author Andres Almiray
 */
class DialogsGriffonPlugin {
    // the plugin version
    String version = '0.6.0'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '1.3.0 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [miglayout: '1.0.0',
                     glazedlists: '2.0.0']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'GNU LGPL 2.1'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = ['swing']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-dialogs-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'Common dialogs'
    String description = '''
The goal of this plugin is to provide a set of reusable dialogs.

Usage
-----

### Finder
This dialog is inspired in the find/replace utility available in TextMate. The
following snippet shows how this dialog can be activated

        package sample

        import griffon.plugins.dialogs.Finder

        class SampleController {
            def view

            def find = {
                Finder.instance.findIt(view.componentToSearch)
            }
        }

The previous code assumes there's a View component identified by 'componentToSearch'
that can be searched. By default only `JTextComponent` subclasses are supported.
You'll have to follow these steps should you wish to support additional components:

 * Create an implementation of the `griffon.plugins.dialogs.Searcher` interface.
 * Register the implementation with `griffon.plugins.dialogs.Finder`. This task can be achieved in two ways:
    * Programmatically. By calling `Finder.getInstance().registerSearcher(FooComponent.class, FooComponentSearcher.class)`.
    * Declaratively. By creating a file named `META-INF/services/griffon.plugins.dialogs.Searcher` with a line per searcher implementation
    following this format:

            com.acme.FooComponent = com.acme.FooComponentSearcher

'''
}
