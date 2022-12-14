package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentD
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAbout
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapBott
import com.olvind.mui.muiMaterial.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bottomNavigationActionBottomNavigationActionMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Bottom Navigation](https://mui.com/material-ui/react-bottom-navigation/)
    *
    * API:
    *
    * - [BottomNavigationAction API](https://mui.com/material-ui/api/bottom-navigation-action/)
    * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
    */
  @JSImport("@mui/material/BottomNavigationAction/BottomNavigationAction", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapBott | DefaultComponentPropsExtendButtonBaseTypAbout, 
    Element | Null
  ] = js.native
  
  type BottomNavigationActionProps[D /* <: ElementType */, P] = OverrideProps[BottomNavigationActionTypeMap[P, D], D]
  
  type BottomNavigationActionTypeMap[P, D /* <: ElementType */] = ExtendButtonBaseTypeMap[DefaultComponentD[P, D]]
  
  type _To = js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapBott | DefaultComponentPropsExtendButtonBaseTypAbout, 
    Element | Null
  ]
  
  /* This means you don't have to write `default`, but can instead just say `bottomNavigationActionBottomNavigationActionMod.foo` */
  override def _to: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapBott | DefaultComponentPropsExtendButtonBaseTypAbout, 
    Element | Null
  ] = default
}
