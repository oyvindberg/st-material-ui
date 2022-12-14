package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.AnchorOrigin
import com.olvind.mui.muiJoy.anon.BadgePropsBadgeTypeMapspandefaultCompone
import com.olvind.mui.muiJoy.anon.BadgeRoot
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ApplyColorInversion
import com.olvind.mui.muiJoy.utilsTypesMod.CreateSlotsAndSlotProps
import com.olvind.mui.muiTypes.mod.OverrideProps
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeBadgePropsMod {
  
  trait BadgeOrigin extends StObject {
    
    var horizontal: "left" | "right"
    
    var vertical: "top" | "bottom"
  }
  object BadgeOrigin {
    
    inline def apply(horizontal: "left" | "right", vertical: "top" | "bottom"): BadgeOrigin = {
      val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadgeOrigin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BadgeOrigin] (val x: Self) extends AnyVal {
      
      inline def setHorizontal(value: "left" | "right"): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setVertical(value: "top" | "bottom"): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
  
  type BadgeOwnerState = ApplyColorInversion[BadgePropsBadgeTypeMapspandefaultCompone]
  
  type BadgeProps[D /* <: ReactElement */, P] = OverrideProps[BadgeTypeMap[D, P], D]
  
  trait BadgePropsColorOverrides extends StObject
  
  trait BadgePropsSizeOverrides extends StObject
  
  trait BadgePropsVariantOverrides extends StObject
  
  object BadgeSlot {
    
    inline def badge: "badge" = "badge".asInstanceOf["badge"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
  }
  type BadgeSlot = "root" | "badge"
  
  trait BadgeSlots extends StObject {
    
    /**
      * The component that renders the badge.
      * @default 'div'
      */
    var badge: ReactElement
    
    /**
      * The component that renders the root.
      * @default 'div'
      */
    var root: ReactElement
  }
  object BadgeSlots {
    
    inline def apply(badge: ReactElement, root: ReactElement): BadgeSlots = {
      val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadgeSlots]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BadgeSlots] (val x: Self) extends AnyVal {
      
      inline def setBadge(value: ReactElement): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: ReactElement): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  type BadgeSlotsAndSlotProps = CreateSlotsAndSlotProps[BadgeSlots, BadgeRoot]
  
  trait BadgeTypeMap[D /* <: ReactElement */, P] extends StObject {
    
    var defaultComponent: D
    
    var props: P & BadgeSlotsAndSlotProps & AnchorOrigin
  }
  object BadgeTypeMap {
    
    inline def apply[D /* <: ReactElement */, P](defaultComponent: D, props: P & BadgeSlotsAndSlotProps & AnchorOrigin): BadgeTypeMap[D, P] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadgeTypeMap[D, P]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BadgeTypeMap[?, ?], D /* <: ReactElement */, P] (val x: Self & (BadgeTypeMap[D, P])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & BadgeSlotsAndSlotProps & AnchorOrigin): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
