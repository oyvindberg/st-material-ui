package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.MaxRows
import com.olvind.mui.muiJoy.anon.PickTextareaHTMLAttributesHTMLTextAreaEl
import com.olvind.mui.muiJoy.anon.RootStartDecoratorTextarea
import com.olvind.mui.muiJoy.utilsTypesMod.CreateSlotsAndSlotProps
import com.olvind.mui.muiTypes.mod.OverrideProps
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textareaTextareaPropsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped std.Omit<@mui/joy.anon.TextareaPropsTextareaTypeMapdivdefaultCo, 'color'> & @mui/joy.anon.62<@mui/joy.anon.TextareaPropsTextareaTypeMapdivdefaultCo> extends std.Function ? std.Omit<@mui/joy.anon.TextareaPropsTextareaTypeMapdivdefaultCo, 'color'> & @mui/joy.anon.62<@mui/joy.anon.TextareaPropsTextareaTypeMapdivdefaultCo> : {[ K in keyof std.Omit<@mui/joy.anon.TextareaPropsTextareaTypeMapdivdefaultCo, 'color'> & @mui/joy.anon.62<@mui/joy.anon.TextareaPropsTextareaTypeMapdivdefaultCo> ]: std.Omit<@mui/joy.anon.TextareaPropsTextareaTypeMapdivdefaultCo, 'color'> & @mui/joy.anon.62<@mui/joy.anon.TextareaPropsTextareaTypeMapdivdefaultCo>[K]} */ trait TextareaOwnerState extends StObject {
    
    /**
      * If `true`, the input is focused.
      */
    var focused: Boolean
  }
  object TextareaOwnerState {
    
    inline def apply(focused: Boolean): TextareaOwnerState = {
      val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextareaOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextareaOwnerState] (val x: Self) extends AnyVal {
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    }
  }
  
  type TextareaProps[D /* <: ElementType */, P] = OverrideProps[TextareaTypeMap[P, D], D]
  
  trait TextareaPropsColorOverrides extends StObject
  
  trait TextareaPropsSizeOverrides extends StObject
  
  trait TextareaPropsVariantOverrides extends StObject
  
  object TextareaSlot {
    
    inline def endDecorator: "endDecorator" = "endDecorator".asInstanceOf["endDecorator"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def startDecorator: "startDecorator" = "startDecorator".asInstanceOf["startDecorator"]
    
    inline def textarea: "textarea" = "textarea".asInstanceOf["textarea"]
  }
  type TextareaSlot = "root" | "textarea" | "startDecorator" | "endDecorator"
  
  type TextareaSlotsAndSlotProps = CreateSlotsAndSlotProps[TextareaSlot, RootStartDecoratorTextarea]
  
  trait TextareaTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & TextareaSlotsAndSlotProps & PickTextareaHTMLAttributesHTMLTextAreaEl & MaxRows
  }
  object TextareaTypeMap {
    
    inline def apply[P, D /* <: ElementType */](
      defaultComponent: D,
      props: P & TextareaSlotsAndSlotProps & PickTextareaHTMLAttributesHTMLTextAreaEl & MaxRows
    ): TextareaTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextareaTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextareaTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (TextareaTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & TextareaSlotsAndSlotProps & PickTextareaHTMLAttributesHTMLTextAreaEl & MaxRows): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
