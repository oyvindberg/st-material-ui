package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.ClassName
import com.olvind.mui.muiJoy.anon.InputRoot
import com.olvind.mui.muiJoy.anon.PickInputHTMLAttributesHTMLInputElementa
import com.olvind.mui.muiJoy.utilsTypesMod.CreateSlotsAndSlotProps
import com.olvind.mui.muiTypes.mod.OverrideProps
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputInputPropsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped std.Omit<@mui/joy.anon.InputPropsInputTypeMapdivdefaultComponen, 'color'> & @mui/joy.anon.61<@mui/joy.anon.InputPropsInputTypeMapdivdefaultComponen> extends std.Function ? std.Omit<@mui/joy.anon.InputPropsInputTypeMapdivdefaultComponen, 'color'> & @mui/joy.anon.61<@mui/joy.anon.InputPropsInputTypeMapdivdefaultComponen> : {[ K in keyof std.Omit<@mui/joy.anon.InputPropsInputTypeMapdivdefaultComponen, 'color'> & @mui/joy.anon.61<@mui/joy.anon.InputPropsInputTypeMapdivdefaultComponen> ]: std.Omit<@mui/joy.anon.InputPropsInputTypeMapdivdefaultComponen, 'color'> & @mui/joy.anon.61<@mui/joy.anon.InputPropsInputTypeMapdivdefaultComponen>[K]} */ trait InputOwnerState extends StObject {
    
    /**
      * If `true`, the input is focused.
      */
    var focused: Boolean
  }
  object InputOwnerState {
    
    inline def apply(focused: Boolean): InputOwnerState = {
      val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputOwnerState] (val x: Self) extends AnyVal {
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    }
  }
  
  type InputProps[D /* <: ElementType */, P] = OverrideProps[InputTypeMap[P, D], D]
  
  trait InputPropsColorOverrides extends StObject
  
  trait InputPropsSizeOverrides extends StObject
  
  trait InputPropsVariantOverrides extends StObject
  
  object InputSlot {
    
    inline def endDecorator: "endDecorator" = "endDecorator".asInstanceOf["endDecorator"]
    
    inline def input: "input" = "input".asInstanceOf["input"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def startDecorator: "startDecorator" = "startDecorator".asInstanceOf["startDecorator"]
  }
  type InputSlot = "root" | "input" | "startDecorator" | "endDecorator"
  
  trait InputSlots extends StObject {
    
    /**
      * The component that renders the end decorator.
      * @default 'span'
      */
    var endDecorator: ElementType
    
    /**
      * The component that renders the input.
      * @default 'input'
      */
    var input: ElementType
    
    /**
      * The component that renders the root.
      * @default 'div'
      */
    var root: ElementType
    
    /**
      * The component that renders the start decorator.
      * @default 'span'
      */
    var startDecorator: ElementType
  }
  object InputSlots {
    
    inline def apply(endDecorator: ElementType, input: ElementType, root: ElementType, startDecorator: ElementType): InputSlots = {
      val __obj = js.Dynamic.literal(endDecorator = endDecorator.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], startDecorator = startDecorator.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputSlots]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputSlots] (val x: Self) extends AnyVal {
      
      inline def setEndDecorator(value: ElementType): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
      
      inline def setInput(value: ElementType): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setStartDecorator(value: ElementType): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    }
  }
  
  type InputSlotsAndSlotProps = CreateSlotsAndSlotProps[InputSlots, InputRoot]
  
  trait InputTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & InputSlotsAndSlotProps & PickInputHTMLAttributesHTMLInputElementa & ClassName
  }
  object InputTypeMap {
    
    inline def apply[P, D /* <: ElementType */](
      defaultComponent: D,
      props: P & InputSlotsAndSlotProps & PickInputHTMLAttributesHTMLInputElementa & ClassName
    ): InputTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (InputTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & InputSlotsAndSlotProps & PickInputHTMLAttributesHTMLInputElementa & ClassName): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
