package com.olvind.mui.muiJoy

import com.olvind.mui.muiBase.menuUnstyledMenuUnstyledDottypesMod.MenuUnstyledActions
import com.olvind.mui.muiJoy.anon.ActionsColor
import com.olvind.mui.muiJoy.anon.MenuListPropsMenuListTypeMapuldefaultCom
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ApplyColorInversion
import com.olvind.mui.muiTypes.mod.OverrideProps
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuListMenuListPropsMod {
  
  type MenuActions = MenuUnstyledActions
  
  type MenuListOwnerState = ApplyColorInversion[MenuListPropsMenuListTypeMapuldefaultCom]
  
  type MenuListProps[D /* <: ReactElement */, P] = OverrideProps[MenuListTypeMap[P, D], D]
  
  trait MenuListPropsColorOverrides extends StObject
  
  trait MenuListPropsSizeOverrides extends StObject
  
  trait MenuListPropsVariantOverrides extends StObject
  
  type MenuListSlot = "root"
  
  trait MenuListTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & ActionsColor
  }
  object MenuListTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & ActionsColor): MenuListTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuListTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuListTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (MenuListTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & ActionsColor): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
