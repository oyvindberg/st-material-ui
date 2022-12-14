package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.ListSubheaderPropsListSubheaderTypeMapdi
import com.olvind.mui.muiJoy.anon.Sticky
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ApplyColorInversion
import com.olvind.mui.muiTypes.mod.OverrideProps
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listSubheaderListSubheaderPropsMod {
  
  trait ListSubheaderColorOverrides extends StObject
  
  type ListSubheaderOwnerState = ApplyColorInversion[ListSubheaderPropsListSubheaderTypeMapdi]
  
  type ListSubheaderProps[D /* <: ReactElement */, P] = OverrideProps[ListSubheaderTypeMap[P, D], D]
  
  type ListSubheaderSlot = "root"
  
  trait ListSubheaderTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & Sticky
  }
  object ListSubheaderTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & Sticky): ListSubheaderTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListSubheaderTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListSubheaderTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (ListSubheaderTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Sticky): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListSubheaderVariantOverrides extends StObject
}
