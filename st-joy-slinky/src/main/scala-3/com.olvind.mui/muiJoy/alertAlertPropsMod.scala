package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.AlertPropsAlertTypeMapdivdefaultComponen
import com.olvind.mui.muiJoy.anon.Color
import com.olvind.mui.muiJoy.anon.Root
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ApplyColorInversion
import com.olvind.mui.muiJoy.utilsTypesMod.CreateSlotsAndSlotProps
import com.olvind.mui.muiTypes.mod.OverrideProps
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alertAlertPropsMod {
  
  type AlertOwnerState = ApplyColorInversion[AlertPropsAlertTypeMapdivdefaultComponen]
  
  type AlertProps[D /* <: ReactElement */, P] = OverrideProps[AlertTypeMap[P, D], D]
  
  trait AlertPropsColorOverrides extends StObject
  
  trait AlertPropsSizeOverrides extends StObject
  
  trait AlertPropsVariantOverrides extends StObject
  
  object AlertSlot {
    
    inline def endDecorator: "endDecorator" = "endDecorator".asInstanceOf["endDecorator"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def startDecorator: "startDecorator" = "startDecorator".asInstanceOf["startDecorator"]
  }
  type AlertSlot = "root" | "startDecorator" | "endDecorator"
  
  trait AlertSlots extends StObject {
    
    /**
      * The component that renders the end decorator.
      * @default 'span'
      */
    var endDecorator: ReactElement
    
    /**
      * The component that renders the root.
      * @default 'div'
      */
    var root: ReactElement
    
    /**
      * The component that renders the start decorator.
      * @default 'span'
      */
    var startDecorator: ReactElement
  }
  object AlertSlots {
    
    inline def apply(endDecorator: ReactElement, root: ReactElement, startDecorator: ReactElement): AlertSlots = {
      val __obj = js.Dynamic.literal(endDecorator = endDecorator.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], startDecorator = startDecorator.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlertSlots]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AlertSlots] (val x: Self) extends AnyVal {
      
      inline def setEndDecorator(value: ReactElement): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: ReactElement): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setStartDecorator(value: ReactElement): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    }
  }
  
  type AlertSlotsAndSlotProps = CreateSlotsAndSlotProps[AlertSlots, Root]
  
  trait AlertTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & AlertSlotsAndSlotProps & Color
  }
  object AlertTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & AlertSlotsAndSlotProps & Color): AlertTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlertTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AlertTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (AlertTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & AlertSlotsAndSlotProps & Color): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
