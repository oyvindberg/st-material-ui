package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.muiMaterial.breadcrumbsBreadcrumbsMod.BreadcrumbsCollapsedIconSlotPropsOverrides
import com.olvind.mui.muiMaterial.breadcrumbsBreadcrumbsMod.BreadcrumbsOwnerState
import com.olvind.mui.react.mod.ComponentPropsWithRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  /**
    * Props applied to the CollapsedIcon slot.
    * @default {}
    */
  var collapsedIcon: js.UndefOr[
    SlotComponentProps[
      OverridableComponentSvgIconTypeMapsvg, 
      BreadcrumbsCollapsedIconSlotPropsOverrides, 
      BreadcrumbsOwnerState
    ]
  ] = js.undefined
}
object `3` {
  
  inline def apply(): `3` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `3`] (val x: Self) extends AnyVal {
    
    inline def setCollapsedIcon(
      value: SlotComponentProps[
          OverridableComponentSvgIconTypeMapsvg, 
          BreadcrumbsCollapsedIconSlotPropsOverrides, 
          BreadcrumbsOwnerState
        ]
    ): Self = StObject.set(x, "collapsedIcon", value.asInstanceOf[js.Any])
    
    inline def setCollapsedIconFunction1(
      value: BreadcrumbsOwnerState => com.olvind.mui.std.Partial[ComponentPropsWithRef[OverridableComponentSvgIconTypeMapsvg]] & BreadcrumbsCollapsedIconSlotPropsOverrides
    ): Self = StObject.set(x, "collapsedIcon", js.Any.fromFunction1(value))
    
    inline def setCollapsedIconUndefined: Self = StObject.set(x, "collapsedIcon", js.undefined)
  }
}
