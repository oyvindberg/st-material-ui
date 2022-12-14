package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.ColorSizeSx
import com.olvind.mui.muiJoy.anon.OmitTabsUnstyledOwnPropsslotsslotProps
import com.olvind.mui.muiJoy.anon.TabsPropsTabsTypeMapdivdefaultComponent
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ApplyColorInversion
import com.olvind.mui.muiTypes.mod.OverrideProps
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsTabsPropsMod {
  
  type TabsOwnerState = ApplyColorInversion[TabsPropsTabsTypeMapdivdefaultComponent]
  
  type TabsProps[D /* <: ReactElement */, P] = OverrideProps[TabsTypeMap[P, D], D]
  
  trait TabsPropsColorOverrides extends StObject
  
  trait TabsPropsSizeOverrides extends StObject
  
  trait TabsPropsVariantOverrides extends StObject
  
  type TabsSlot = "root"
  
  trait TabsTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & OmitTabsUnstyledOwnPropsslotsslotProps & ColorSizeSx
  }
  object TabsTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & OmitTabsUnstyledOwnPropsslotsslotProps & ColorSizeSx): TabsTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabsTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabsTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (TabsTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & OmitTabsUnstyledOwnPropsslotsslotProps & ColorSizeSx): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
