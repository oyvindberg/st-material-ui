package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.muiMaterial.tabsTabsMod.TabsEndScrollButtonIconSlotPropsOverrides
import com.olvind.mui.muiMaterial.tabsTabsMod.TabsOwnerState
import com.olvind.mui.muiMaterial.tabsTabsMod.TabsStartScrollButtonIconSlotPropsOverrides
import com.olvind.mui.react.mod.ComponentPropsWithRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndScrollButtonIconStartScrollButtonIcon extends StObject {
  
  var endScrollButtonIcon: js.UndefOr[
    SlotComponentProps[
      OverridableComponentSvgIconTypeMapsvg, 
      TabsEndScrollButtonIconSlotPropsOverrides, 
      TabsOwnerState
    ]
  ] = js.undefined
  
  var startScrollButtonIcon: js.UndefOr[
    SlotComponentProps[
      OverridableComponentSvgIconTypeMapsvg, 
      TabsStartScrollButtonIconSlotPropsOverrides, 
      TabsOwnerState
    ]
  ] = js.undefined
}
object EndScrollButtonIconStartScrollButtonIcon {
  
  inline def apply(): EndScrollButtonIconStartScrollButtonIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndScrollButtonIconStartScrollButtonIcon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndScrollButtonIconStartScrollButtonIcon] (val x: Self) extends AnyVal {
    
    inline def setEndScrollButtonIcon(
      value: SlotComponentProps[
          OverridableComponentSvgIconTypeMapsvg, 
          TabsEndScrollButtonIconSlotPropsOverrides, 
          TabsOwnerState
        ]
    ): Self = StObject.set(x, "endScrollButtonIcon", value.asInstanceOf[js.Any])
    
    inline def setEndScrollButtonIconFunction1(
      value: TabsOwnerState => com.olvind.mui.std.Partial[ComponentPropsWithRef[OverridableComponentSvgIconTypeMapsvg]] & TabsEndScrollButtonIconSlotPropsOverrides
    ): Self = StObject.set(x, "endScrollButtonIcon", js.Any.fromFunction1(value))
    
    inline def setEndScrollButtonIconUndefined: Self = StObject.set(x, "endScrollButtonIcon", js.undefined)
    
    inline def setStartScrollButtonIcon(
      value: SlotComponentProps[
          OverridableComponentSvgIconTypeMapsvg, 
          TabsStartScrollButtonIconSlotPropsOverrides, 
          TabsOwnerState
        ]
    ): Self = StObject.set(x, "startScrollButtonIcon", value.asInstanceOf[js.Any])
    
    inline def setStartScrollButtonIconFunction1(
      value: TabsOwnerState => com.olvind.mui.std.Partial[ComponentPropsWithRef[OverridableComponentSvgIconTypeMapsvg]] & TabsStartScrollButtonIconSlotPropsOverrides
    ): Self = StObject.set(x, "startScrollButtonIcon", js.Any.fromFunction1(value))
    
    inline def setStartScrollButtonIconUndefined: Self = StObject.set(x, "startScrollButtonIcon", js.undefined)
  }
}
