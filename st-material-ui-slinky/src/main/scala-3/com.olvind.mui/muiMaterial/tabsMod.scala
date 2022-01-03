package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAction
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapButtAbout
import com.olvind.mui.muiMaterial.overridableComponentMod.OverridableComponent
import com.olvind.mui.muiMaterial.tabsClassesMod.TabsClasses
import com.olvind.mui.muiMaterial.tabsTabsMod.TabsTypeMap
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsMod {
  
  @JSImport("@mui/material/Tabs", JSImport.Namespace)
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
    * - [Tabs API](https://mui.com/api/tabs/)
    */
  @JSImport("@mui/material/Tabs", JSImport.Default)
  @js.native
  val default: OverridableComponent[
    TabsTypeMap[
      js.Object, 
      js.Function1[
        /* props */ OverridePropsExtendButtonBaseTypeMapButtAbout | DefaultComponentPropsExtendButtonBaseTypAction, 
        ReactElement | Null
      ]
    ]
  ] = js.native
  
  inline def getTabsUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTabsUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Tabs", "tabsClasses")
  @js.native
  val tabsClasses: TabsClasses = js.native
}
