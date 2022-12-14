package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.AspectRatioPropsAspectRatioTypeMapdivdef
import com.olvind.mui.muiJoy.anon.Children
import com.olvind.mui.muiJoy.anon.ContentRoot
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ApplyColorInversion
import com.olvind.mui.muiJoy.utilsTypesMod.CreateSlotsAndSlotProps
import com.olvind.mui.muiTypes.mod.OverrideProps
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aspectRatioAspectRatioPropsMod {
  
  type AspectRatioOwnerState = ApplyColorInversion[AspectRatioPropsAspectRatioTypeMapdivdef]
  
  type AspectRatioProps[D /* <: ElementType */, P] = OverrideProps[AspectRatioTypeMap[P, D], D]
  
  trait AspectRatioPropsColorOverrides extends StObject
  
  trait AspectRatioPropsVariantOverrides extends StObject
  
  object AspectRatioSlot {
    
    inline def content: "content" = "content".asInstanceOf["content"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
  }
  type AspectRatioSlot = "root" | "content"
  
  trait AspectRatioSlots extends StObject {
    
    /**
      * The component that renders the content.
      * @default 'div'
      */
    var content: ElementType
    
    /**
      * The component that renders the root.
      * @default 'div'
      */
    var root: ElementType
  }
  object AspectRatioSlots {
    
    inline def apply(content: ElementType, root: ElementType): AspectRatioSlots = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[AspectRatioSlots]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AspectRatioSlots] (val x: Self) extends AnyVal {
      
      inline def setContent(value: ElementType): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  type AspectRatioSlotsAndSlotProps = CreateSlotsAndSlotProps[AspectRatioSlots, ContentRoot]
  
  trait AspectRatioTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & AspectRatioSlotsAndSlotProps & Children
  }
  object AspectRatioTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & AspectRatioSlotsAndSlotProps & Children): AspectRatioTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[AspectRatioTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AspectRatioTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (AspectRatioTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & AspectRatioSlotsAndSlotProps & Children): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
