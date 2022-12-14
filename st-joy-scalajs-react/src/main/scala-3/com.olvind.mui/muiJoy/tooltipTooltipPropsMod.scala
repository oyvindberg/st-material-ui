package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.ArrowRoot
import com.olvind.mui.muiJoy.anon.DescribeChild
import com.olvind.mui.muiJoy.anon.PickPopperUnstyledPropsdivdisablePortald
import com.olvind.mui.muiJoy.utilsTypesMod.CreateSlotsAndSlotProps
import com.olvind.mui.muiTypes.mod.OverrideProps
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipTooltipPropsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped std.Omit<@mui/joy.anon.TooltipPropsTooltipTypeMapdivdefaultComp, 'color'> & @mui/joy.anon.61<@mui/joy.anon.TooltipPropsTooltipTypeMapdivdefaultComp> extends std.Function ? std.Omit<@mui/joy.anon.TooltipPropsTooltipTypeMapdivdefaultComp, 'color'> & @mui/joy.anon.61<@mui/joy.anon.TooltipPropsTooltipTypeMapdivdefaultComp> : {[ K in keyof std.Omit<@mui/joy.anon.TooltipPropsTooltipTypeMapdivdefaultComp, 'color'> & @mui/joy.anon.61<@mui/joy.anon.TooltipPropsTooltipTypeMapdivdefaultComp> ]: std.Omit<@mui/joy.anon.TooltipPropsTooltipTypeMapdivdefaultComp, 'color'> & @mui/joy.anon.61<@mui/joy.anon.TooltipPropsTooltipTypeMapdivdefaultComp>[K]} */ trait TooltipOwnerState extends StObject {
    
    var touch: Boolean
  }
  object TooltipOwnerState {
    
    inline def apply(touch: Boolean): TooltipOwnerState = {
      val __obj = js.Dynamic.literal(touch = touch.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipOwnerState] (val x: Self) extends AnyVal {
      
      inline def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    }
  }
  
  type TooltipProps[D /* <: ElementType */, P] = OverrideProps[TooltipTypeMap[P, D], D]
  
  trait TooltipPropsColorOverrides extends StObject
  
  trait TooltipPropsSizeOverrides extends StObject
  
  trait TooltipPropsVariantOverrides extends StObject
  
  object TooltipSlot {
    
    inline def arrow: "arrow" = "arrow".asInstanceOf["arrow"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
  }
  type TooltipSlot = "root" | "arrow"
  
  trait TooltipSlots extends StObject {
    
    /**
      * The component that renders the arrow.
      * @default 'span'
      */
    var arrow: ElementType
    
    /**
      * The component that renders the root.
      * @default 'div'
      */
    var root: ElementType
  }
  object TooltipSlots {
    
    inline def apply(arrow: ElementType, root: ElementType): TooltipSlots = {
      val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipSlots]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipSlots] (val x: Self) extends AnyVal {
      
      inline def setArrow(value: ElementType): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  type TooltipSlotsAndSlotProps = CreateSlotsAndSlotProps[TooltipSlots, ArrowRoot]
  
  trait TooltipTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & TooltipSlotsAndSlotProps & PickPopperUnstyledPropsdivdisablePortald & DescribeChild
  }
  object TooltipTypeMap {
    
    inline def apply[P, D /* <: ElementType */](
      defaultComponent: D,
      props: P & TooltipSlotsAndSlotProps & PickPopperUnstyledPropsdivdisablePortald & DescribeChild
    ): TooltipTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (TooltipTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & TooltipSlotsAndSlotProps & PickPopperUnstyledPropsdivdisablePortald & DescribeChild): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
