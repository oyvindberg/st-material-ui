package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.EndDecoratorSlotProps
import com.olvind.mui.muiJoy.anon.GutterBottom
import com.olvind.mui.muiJoy.anon.OmitSystemPropscolor
import com.olvind.mui.muiJoy.utilsTypesMod.CreateSlotsAndSlotProps
import com.olvind.mui.muiTypes.mod.OverrideProps
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typographyTypographyPropsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped std.Omit<@mui/joy.anon.TypographyPropsTypographyTypeMapspandefa, 'color'> & @mui/joy.anon.61<@mui/joy.anon.TypographyPropsTypographyTypeMapspandefa> extends std.Function ? std.Omit<@mui/joy.anon.TypographyPropsTypographyTypeMapspandefa, 'color'> & @mui/joy.anon.61<@mui/joy.anon.TypographyPropsTypographyTypeMapspandefa> : {[ K in keyof std.Omit<@mui/joy.anon.TypographyPropsTypographyTypeMapspandefa, 'color'> & @mui/joy.anon.61<@mui/joy.anon.TypographyPropsTypographyTypeMapspandefa> ]: std.Omit<@mui/joy.anon.TypographyPropsTypographyTypeMapspandefa, 'color'> & @mui/joy.anon.61<@mui/joy.anon.TypographyPropsTypographyTypeMapspandefa>[K]} */ trait TypographyOwnerState extends StObject {
    
    /**
      * If `true`, the element is rendered in a Typography.
      */
    var nesting: Boolean
  }
  object TypographyOwnerState {
    
    inline def apply(nesting: Boolean): TypographyOwnerState = {
      val __obj = js.Dynamic.literal(nesting = nesting.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypographyOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypographyOwnerState] (val x: Self) extends AnyVal {
      
      inline def setNesting(value: Boolean): Self = StObject.set(x, "nesting", value.asInstanceOf[js.Any])
    }
  }
  
  type TypographyProps[D /* <: ReactElement */, P] = OverrideProps[TypographyTypeMap[P, D], D]
  
  trait TypographyPropsColorOverrides extends StObject
  
  trait TypographyPropsVariantOverrides extends StObject
  
  object TypographySlot {
    
    inline def endDecorator: "endDecorator" = "endDecorator".asInstanceOf["endDecorator"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def startDecorator: "startDecorator" = "startDecorator".asInstanceOf["startDecorator"]
  }
  type TypographySlot = "root" | "startDecorator" | "endDecorator"
  
  trait TypographySlots extends StObject {
    
    /**
      * The component that renders the end decorator.
      * @default 'span'
      */
    var endDecorator: ReactElement
    
    /**
      * The component that renders the root.
      * @default 'a'
      */
    var root: ReactElement
    
    /**
      * The component that renders the start decorator.
      * @default 'span'
      */
    var startDecorator: ReactElement
  }
  object TypographySlots {
    
    inline def apply(endDecorator: ReactElement, root: ReactElement, startDecorator: ReactElement): TypographySlots = {
      val __obj = js.Dynamic.literal(endDecorator = endDecorator.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], startDecorator = startDecorator.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypographySlots]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypographySlots] (val x: Self) extends AnyVal {
      
      inline def setEndDecorator(value: ReactElement): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: ReactElement): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setStartDecorator(value: ReactElement): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    }
  }
  
  type TypographySlotsAndSlotProps = CreateSlotsAndSlotProps[TypographySlots, EndDecoratorSlotProps]
  
  trait TypographyTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & TypographySlotsAndSlotProps & OmitSystemPropscolor & GutterBottom
  }
  object TypographyTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & TypographySlotsAndSlotProps & OmitSystemPropscolor & GutterBottom): TypographyTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypographyTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypographyTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (TypographyTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & TypographySlotsAndSlotProps & OmitSystemPropscolor & GutterBottom): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
