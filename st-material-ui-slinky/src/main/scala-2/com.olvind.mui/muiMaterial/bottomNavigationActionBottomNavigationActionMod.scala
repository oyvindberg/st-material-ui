package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentDProps
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAbout
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapBott
import com.olvind.mui.muiMaterial.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bottomNavigationActionBottomNavigationActionMod extends Shortcut {
  
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
  @JSImport("@mui/material/BottomNavigationAction/BottomNavigationAction", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapBott | DefaultComponentPropsExtendButtonBaseTypAbout, 
    ReactElement | Null
  ] = js.native
  
  type BottomNavigationActionProps[D /* <: ReactElement */, P] = OverrideProps[BottomNavigationActionTypeMap[P, D], D]
  
  type BottomNavigationActionTypeMap[P, D /* <: ReactElement */] = ExtendButtonBaseTypeMap[DefaultComponentDProps[P, D]]
  
  type _To = js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapBott | DefaultComponentPropsExtendButtonBaseTypAbout, 
    ReactElement | Null
  ]
  
  /* This means you don't have to write `default`, but can instead just say `bottomNavigationActionBottomNavigationActionMod.foo` */
  override def _to: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapBott | DefaultComponentPropsExtendButtonBaseTypAbout, 
    ReactElement | Null
  ] = default
}
