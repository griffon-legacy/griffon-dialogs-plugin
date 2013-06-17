
Common dialogs
--------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/dialogs](http://artifacts.griffon-framework.org/plugin/dialogs)


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


