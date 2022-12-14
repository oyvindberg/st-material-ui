package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.ColorSizeSx
import com.olvind.mui.muiJoy.anon.OmitTabsUnstyledOwnPropsslotsslotProps
import com.olvind.mui.muiJoy.anon.TabsPropsTabsTypeMapdivdefaultComponent
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ApplyColorInversion
import com.olvind.mui.muiTypes.mod.OverrideProps
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsTabsPropsMod {
  
  type TabsOwnerState = ApplyColorInversion[TabsPropsTabsTypeMapdivdefaultComponent]
  
  type TabsProps[D /* <: ElementType */, P] = OverrideProps[TabsTypeMap[P, D], D]
  
  trait TabsPropsColorOverrides extends StObject
  
  trait TabsPropsSizeOverrides extends StObject
  
  trait TabsPropsVariantOverrides extends StObject
  
  type TabsSlot = "root"
  
  trait TabsTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & OmitTabsUnstyledOwnPropsslotsslotProps & ColorSizeSx
  }
  object TabsTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & OmitTabsUnstyledOwnPropsslotsslotProps & ColorSizeSx): TabsTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabsTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabsTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (TabsTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & OmitTabsUnstyledOwnPropsslotsslotProps & ColorSizeSx): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
