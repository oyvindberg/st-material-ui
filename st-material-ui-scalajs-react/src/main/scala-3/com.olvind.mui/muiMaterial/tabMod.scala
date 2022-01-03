package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriacolindex
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapTabT
import com.olvind.mui.muiMaterial.tabClassesMod.TabClasses
import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabMod {
  
  @JSImport("@mui/material/Tab", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Tabs](https://mui.com/components/tabs/)
    *
    * API:
    *
    * - [Tab API](https://mui.com/api/tab/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@mui/material/Tab", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapTabT | DefaultComponentPropsExtendButtonBaseTypAriacolindex, 
    Element | Null
  ] = js.native
  
  inline def getTabUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTabUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Tab", "tabClasses")
  @js.native
  val tabClasses: TabClasses = js.native
}
