package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.Alt
import com.olvind.mui.muiJoy.anon.Img
import com.olvind.mui.muiJoy.utilsTypesMod.CreateSlotsAndSlotProps
import com.olvind.mui.muiTypes.mod.OverrideProps
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarAvatarPropsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped std.Omit<@mui/joy.anon.AvatarPropsAvatarTypeMapdivdefaultCompon, 'color'> & @mui/joy.anon.61<@mui/joy.anon.AvatarPropsAvatarTypeMapdivdefaultCompon> extends std.Function ? std.Omit<@mui/joy.anon.AvatarPropsAvatarTypeMapdivdefaultCompon, 'color'> & @mui/joy.anon.61<@mui/joy.anon.AvatarPropsAvatarTypeMapdivdefaultCompon> : {[ K in keyof std.Omit<@mui/joy.anon.AvatarPropsAvatarTypeMapdivdefaultCompon, 'color'> & @mui/joy.anon.61<@mui/joy.anon.AvatarPropsAvatarTypeMapdivdefaultCompon> ]: std.Omit<@mui/joy.anon.AvatarPropsAvatarTypeMapdivdefaultCompon, 'color'> & @mui/joy.anon.61<@mui/joy.anon.AvatarPropsAvatarTypeMapdivdefaultCompon>[K]} */ trait AvatarOwnerState extends StObject {
    
    /**
      * The avatar is wrapped by AvatarGroup component.
      */
    var grouped: Boolean
  }
  object AvatarOwnerState {
    
    inline def apply(grouped: Boolean): AvatarOwnerState = {
      val __obj = js.Dynamic.literal(grouped = grouped.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvatarOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvatarOwnerState] (val x: Self) extends AnyVal {
      
      inline def setGrouped(value: Boolean): Self = StObject.set(x, "grouped", value.asInstanceOf[js.Any])
    }
  }
  
  type AvatarProps[D /* <: ElementType */, P] = OverrideProps[AvatarTypeMap[P, D], D]
  
  trait AvatarPropsColorOverrides extends StObject
  
  trait AvatarPropsSizeOverrides extends StObject
  
  trait AvatarPropsVariantOverrides extends StObject
  
  object AvatarSlot {
    
    inline def fallback: "fallback" = "fallback".asInstanceOf["fallback"]
    
    inline def img: "img" = "img".asInstanceOf["img"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
  }
  type AvatarSlot = "root" | "img" | "fallback"
  
  trait AvatarSlots extends StObject {
    
    /**
      * The component that renders the fallback.
      * @default 'svg'
      */
    var fallback: ElementType
    
    /**
      * The component that renders the img.
      * @default 'img'
      */
    var img: ElementType
    
    /**
      * The component that renders the root.
      * @default 'div'
      */
    var root: ElementType
  }
  object AvatarSlots {
    
    inline def apply(fallback: ElementType, img: ElementType, root: ElementType): AvatarSlots = {
      val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvatarSlots]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvatarSlots] (val x: Self) extends AnyVal {
      
      inline def setFallback(value: ElementType): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setImg(value: ElementType): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  type AvatarSlotsAndSlotProps = CreateSlotsAndSlotProps[AvatarSlots, Img]
  
  trait AvatarTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & AvatarSlotsAndSlotProps & Alt
  }
  object AvatarTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & AvatarSlotsAndSlotProps & Alt): AvatarTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvatarTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvatarTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (AvatarTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & AvatarSlotsAndSlotProps & Alt): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
