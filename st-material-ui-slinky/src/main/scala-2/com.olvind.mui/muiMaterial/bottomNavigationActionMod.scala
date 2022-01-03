package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAbout
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapBott
import com.olvind.mui.muiMaterial.bottomNavigationActionClassesMod.BottomNavigationActionClasses
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bottomNavigationActionMod {
  
  @JSImport("@mui/material/BottomNavigationAction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Bottom Navigation](https://mui.com/components/bottom-navigation/)
    *
    * API:
    *
    * - [BottomNavigationAction API](https://mui.com/api/bottom-navigation-action/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@mui/material/BottomNavigationAction", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapBott | DefaultComponentPropsExtendButtonBaseTypAbout, 
    ReactElement | Null
  ] = js.native
  
  @JSImport("@mui/material/BottomNavigationAction", "bottomNavigationActionClasses")
  @js.native
  val bottomNavigationActionClasses: BottomNavigationActionClasses = js.native
  
  @scala.inline
  def getBottomNavigationActionUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBottomNavigationActionUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
