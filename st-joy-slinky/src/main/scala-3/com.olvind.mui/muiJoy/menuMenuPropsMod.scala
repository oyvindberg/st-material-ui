package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.Actions
import com.olvind.mui.muiJoy.anon.MenuPropsMenuTypeMapuldefaultComponent
import com.olvind.mui.muiJoy.anon.OmitPopperUnstyledPropsdivchildrenopen
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ApplyColorInversion
import com.olvind.mui.muiTypes.mod.OverrideProps
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMenuPropsMod {
  
  type MenuOwnerState = ApplyColorInversion[MenuPropsMenuTypeMapuldefaultComponent]
  
  type MenuProps[D /* <: ReactElement */, P] = OverrideProps[MenuTypeMap[P, D], D]
  
  trait MenuPropsColorOverrides extends StObject
  
  trait MenuPropsSizeOverrides extends StObject
  
  trait MenuPropsVariantOverrides extends StObject
  
  type MenuSlot = "root"
  
  trait MenuTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & Actions & OmitPopperUnstyledPropsdivchildrenopen
  }
  object MenuTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & Actions & OmitPopperUnstyledPropsdivchildrenopen): MenuTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (MenuTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Actions & OmitPopperUnstyledPropsdivchildrenopen): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
