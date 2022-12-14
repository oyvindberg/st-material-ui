package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.Level
import com.olvind.mui.muiJoy.anon.OmitSystemPropscolor
import com.olvind.mui.muiJoy.anon.RootStartDecorator
import com.olvind.mui.muiJoy.utilsTypesMod.CreateSlotsAndSlotProps
import com.olvind.mui.muiTypes.mod.OverrideProps
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkLinkPropsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped std.Omit<@mui/joy.anon.LinkPropsLinkTypeMapadefaultComponent, 'color'> & @mui/joy.anon.61<@mui/joy.anon.LinkPropsLinkTypeMapadefaultComponent> extends std.Function ? std.Omit<@mui/joy.anon.LinkPropsLinkTypeMapadefaultComponent, 'color'> & @mui/joy.anon.61<@mui/joy.anon.LinkPropsLinkTypeMapadefaultComponent> : {[ K in keyof std.Omit<@mui/joy.anon.LinkPropsLinkTypeMapadefaultComponent, 'color'> & @mui/joy.anon.61<@mui/joy.anon.LinkPropsLinkTypeMapadefaultComponent> ]: std.Omit<@mui/joy.anon.LinkPropsLinkTypeMapadefaultComponent, 'color'> & @mui/joy.anon.61<@mui/joy.anon.LinkPropsLinkTypeMapadefaultComponent>[K]} */ trait LinkOwnerState extends StObject {
    
    /**
      * If `true`, the element's focus is visible.
      */
    var focusVisible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @internal
      * If `true`, the element is rendered inside a Typography component.
      */
    var nesting: Boolean
  }
  object LinkOwnerState {
    
    inline def apply(nesting: Boolean): LinkOwnerState = {
      val __obj = js.Dynamic.literal(nesting = nesting.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkOwnerState] (val x: Self) extends AnyVal {
      
      inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setFocusVisibleUndefined: Self = StObject.set(x, "focusVisible", js.undefined)
      
      inline def setNesting(value: Boolean): Self = StObject.set(x, "nesting", value.asInstanceOf[js.Any])
    }
  }
  
  type LinkProps[D /* <: ElementType */, P] = OverrideProps[LinkTypeMap[P, D], D]
  
  trait LinkPropsColorOverrides extends StObject
  
  trait LinkPropsVariantOverrides extends StObject
  
  object LinkSlot {
    
    inline def endDecorator: "endDecorator" = "endDecorator".asInstanceOf["endDecorator"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def startDecorator: "startDecorator" = "startDecorator".asInstanceOf["startDecorator"]
  }
  type LinkSlot = "root" | "startDecorator" | "endDecorator"
  
  trait LinkSlots extends StObject {
    
    /**
      * The component that renders the end decorator.
      * @default 'span'
      */
    var endDecorator: ElementType
    
    /**
      * The component that renders the root.
      * @default 'a'
      */
    var root: ElementType
    
    /**
      * The component that renders the start decorator.
      * @default 'span'
      */
    var startDecorator: ElementType
  }
  object LinkSlots {
    
    inline def apply(endDecorator: ElementType, root: ElementType, startDecorator: ElementType): LinkSlots = {
      val __obj = js.Dynamic.literal(endDecorator = endDecorator.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], startDecorator = startDecorator.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkSlots]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkSlots] (val x: Self) extends AnyVal {
      
      inline def setEndDecorator(value: ElementType): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setStartDecorator(value: ElementType): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    }
  }
  
  type LinkSlotsAndSlotProps = CreateSlotsAndSlotProps[LinkSlots, RootStartDecorator]
  
  trait LinkTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & LinkSlotsAndSlotProps & OmitSystemPropscolor & Level
  }
  object LinkTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & LinkSlotsAndSlotProps & OmitSystemPropscolor & Level): LinkTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (LinkTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & LinkSlotsAndSlotProps & OmitSystemPropscolor & Level): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
