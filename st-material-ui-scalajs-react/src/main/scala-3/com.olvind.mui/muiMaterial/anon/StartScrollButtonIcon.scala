package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.muiMaterial.tabScrollButtonTabScrollButtonMod.TabScrollButtonEndIconSlotPropsOverrides
import com.olvind.mui.muiMaterial.tabScrollButtonTabScrollButtonMod.TabScrollButtonOwnerState
import com.olvind.mui.muiMaterial.tabScrollButtonTabScrollButtonMod.TabScrollButtonStartIconSlotPropsOverrides
import com.olvind.mui.react.mod.ComponentPropsWithRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartScrollButtonIcon extends StObject {
  
  var endScrollButtonIcon: js.UndefOr[
    SlotComponentProps[
      OverridableComponentSvgIconTypeMapsvg, 
      TabScrollButtonEndIconSlotPropsOverrides, 
      TabScrollButtonOwnerState
    ]
  ] = js.undefined
  
  var startScrollButtonIcon: js.UndefOr[
    SlotComponentProps[
      OverridableComponentSvgIconTypeMapsvg, 
      TabScrollButtonStartIconSlotPropsOverrides, 
      TabScrollButtonOwnerState
    ]
  ] = js.undefined
}
object StartScrollButtonIcon {
  
  inline def apply(): StartScrollButtonIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartScrollButtonIcon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartScrollButtonIcon] (val x: Self) extends AnyVal {
    
    inline def setEndScrollButtonIcon(
      value: SlotComponentProps[
          OverridableComponentSvgIconTypeMapsvg, 
          TabScrollButtonEndIconSlotPropsOverrides, 
          TabScrollButtonOwnerState
        ]
    ): Self = StObject.set(x, "endScrollButtonIcon", value.asInstanceOf[js.Any])
    
    inline def setEndScrollButtonIconFunction1(
      value: TabScrollButtonOwnerState => com.olvind.mui.std.Partial[ComponentPropsWithRef[OverridableComponentSvgIconTypeMapsvg]] & TabScrollButtonEndIconSlotPropsOverrides
    ): Self = StObject.set(x, "endScrollButtonIcon", js.Any.fromFunction1(value))
    
    inline def setEndScrollButtonIconUndefined: Self = StObject.set(x, "endScrollButtonIcon", js.undefined)
    
    inline def setStartScrollButtonIcon(
      value: SlotComponentProps[
          OverridableComponentSvgIconTypeMapsvg, 
          TabScrollButtonStartIconSlotPropsOverrides, 
          TabScrollButtonOwnerState
        ]
    ): Self = StObject.set(x, "startScrollButtonIcon", value.asInstanceOf[js.Any])
    
    inline def setStartScrollButtonIconFunction1(
      value: TabScrollButtonOwnerState => com.olvind.mui.std.Partial[ComponentPropsWithRef[OverridableComponentSvgIconTypeMapsvg]] & TabScrollButtonStartIconSlotPropsOverrides
    ): Self = StObject.set(x, "startScrollButtonIcon", js.Any.fromFunction1(value))
    
    inline def setStartScrollButtonIconUndefined: Self = StObject.set(x, "startScrollButtonIcon", js.undefined)
  }
}
