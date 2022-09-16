This is a framework for creating help system.
Using the help activity and the fragments build a help system using webviews.
Webviews are good because they are easy to make pretty and edit.
1. Add fragments to res/ navigation ex: mobile_navigation (recommend renaming to help navigation)
2. Add or remove fragments to the 'hambuger' in this code on MainActivity
onCreate..
 appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_first, R.id.nav_second, R.id.nav_third, R.id.nav_fourth, R.id.nav_fifth // BLA BLA BLA.. add and remove here
            ), drawerLayout
        )
