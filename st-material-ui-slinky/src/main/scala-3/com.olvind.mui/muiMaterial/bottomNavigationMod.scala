package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsBottomNavigationTyp
import com.olvind.mui.muiMaterial.bottomNavigationBottomNavigationClassesMod.BottomNavigationClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bottomNavigationMod {
  
  @JSImport("@mui/material/BottomNavigation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Bottom Navigation](https://mui.com/material-ui/react-bottom-navigation/)
    *
    * API:
    *
    * - [BottomNavigation API](https://mui.com/material-ui/api/bottom-navigation/)
    */
  @JSImport("@mui/material/BottomNavigation", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsBottomNavigationTyp, Element] = js.native
  
  @JSImport("@mui/material/BottomNavigation", "bottomNavigationClasses")
  @js.native
  val bottomNavigationClasses: BottomNavigationClasses = js.native
  
  inline def getBottomNavigationUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBottomNavigationUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
