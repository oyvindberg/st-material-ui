package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.Action
import com.olvind.mui.muiJoy.anon.ButtonTypeMapbuttonprops
import com.olvind.mui.muiJoy.anon.StartDecorator
import com.olvind.mui.muiJoy.utilsTypesMod.CreateSlotsAndSlotProps
import com.olvind.mui.muiTypes.mod.OverridableComponent
import com.olvind.mui.muiTypes.mod.OverridableTypeMap
import com.olvind.mui.muiTypes.mod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonButtonPropsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped std.Omit<@mui/joy.anon.ButtonPropsButtonTypeMapbuttondefaultCom, 'color'> & @mui/joy.anon.61<@mui/joy.anon.ButtonPropsButtonTypeMapbuttondefaultCom> extends std.Function ? std.Omit<@mui/joy.anon.ButtonPropsButtonTypeMapbuttondefaultCom, 'color'> & @mui/joy.anon.61<@mui/joy.anon.ButtonPropsButtonTypeMapbuttondefaultCom> : {[ K in keyof std.Omit<@mui/joy.anon.ButtonPropsButtonTypeMapbuttondefaultCom, 'color'> & @mui/joy.anon.61<@mui/joy.anon.ButtonPropsButtonTypeMapbuttondefaultCom> ]: std.Omit<@mui/joy.anon.ButtonPropsButtonTypeMapbuttondefaultCom, 'color'> & @mui/joy.anon.61<@mui/joy.anon.ButtonPropsButtonTypeMapbuttondefaultCom>[K]} */ trait ButtonOwnerState extends StObject {
    
    /**
      * If `true`, the button's focus is visible.
      */
    var focusVisible: js.UndefOr[Boolean] = js.undefined
  }
  object ButtonOwnerState {
    
    inline def apply(): ButtonOwnerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonOwnerState] (val x: Self) extends AnyVal {
      
      inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setFocusVisibleUndefined: Self = StObject.set(x, "focusVisible", js.undefined)
    }
  }
  
  type ButtonProps[D /* <: ElementType */, P] = OverrideProps[ButtonTypeMap[P, D], D]
  
  trait ButtonPropsColorOverrides extends StObject
  
  trait ButtonPropsSizeOverrides extends StObject
  
  trait ButtonPropsVariantOverrides extends StObject
  
  object ButtonSlot {
    
    inline def endDecorator: "endDecorator" = "endDecorator".asInstanceOf["endDecorator"]
    
    inline def loadingIndicatorCenter: "loadingIndicatorCenter" = "loadingIndicatorCenter".asInstanceOf["loadingIndicatorCenter"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def startDecorator: "startDecorator" = "startDecorator".asInstanceOf["startDecorator"]
  }
  type ButtonSlot = "root" | "startDecorator" | "endDecorator" | "loadingIndicatorCenter"
  
  trait ButtonSlots extends StObject {
    
    /**
      * The component that renders the end decorator.
      * @default 'span'
      */
    var endDecorator: ElementType
    
    /**
      * The component that renders the loading indicator center.
      * @default 'span'
      */
    var loadingIndicatorCenter: ElementType
    
    /**
      * The component that renders the root.
      * @default 'button'
      */
    var root: ElementType
    
    /**
      * The component that renders the start decorator.
      * @default 'span'
      */
    var startDecorator: ElementType
  }
  object ButtonSlots {
    
    inline def apply(
      endDecorator: ElementType,
      loadingIndicatorCenter: ElementType,
      root: ElementType,
      startDecorator: ElementType
    ): ButtonSlots = {
      val __obj = js.Dynamic.literal(endDecorator = endDecorator.asInstanceOf[js.Any], loadingIndicatorCenter = loadingIndicatorCenter.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], startDecorator = startDecorator.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonSlots]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonSlots] (val x: Self) extends AnyVal {
      
      inline def setEndDecorator(value: ElementType): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
      
      inline def setLoadingIndicatorCenter(value: ElementType): Self = StObject.set(x, "loadingIndicatorCenter", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setStartDecorator(value: ElementType): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    }
  }
  
  type ButtonSlotsAndSlotProps = CreateSlotsAndSlotProps[ButtonSlots, StartDecorator]
  
  trait ButtonTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & ButtonSlotsAndSlotProps & Action
  }
  object ButtonTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & ButtonSlotsAndSlotProps & Action): ButtonTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (ButtonTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & ButtonSlotsAndSlotProps & Action): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type ExtendButton[M /* <: OverridableTypeMap */] = (js.Function1[/* props */ OverrideProps[ExtendButtonTypeMap[M], "a"], Element]) & OverridableComponent[ExtendButtonTypeMap[M]]
  
  trait ExtendButtonTypeMap[M /* <: OverridableTypeMap */] extends StObject {
    
    var defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
    
    var props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & ButtonTypeMapbuttonprops
  }
  object ExtendButtonTypeMap {
    
    inline def apply[M /* <: OverridableTypeMap */](
      defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any,
      props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & ButtonTypeMapbuttonprops
    ): ExtendButtonTypeMap[M] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendButtonTypeMap[M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtendButtonTypeMap[?], M /* <: OverridableTypeMap */] (val x: Self & ExtendButtonTypeMap[M]) extends AnyVal {
      
      inline def setDefaultComponent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
      ): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & ButtonTypeMapbuttonprops
      ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
