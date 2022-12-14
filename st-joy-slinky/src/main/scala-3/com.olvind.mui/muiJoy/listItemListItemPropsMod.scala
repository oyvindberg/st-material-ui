package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.Nested
import com.olvind.mui.muiJoy.anon.StartAction
import com.olvind.mui.muiJoy.utilsTypesMod.CreateSlotsAndSlotProps
import com.olvind.mui.muiTypes.mod.OverrideProps
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemListItemPropsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped std.Omit<@mui/joy.anon.ListItemPropsListItemTypeMaplidefaultCom, 'color'> & @mui/joy.anon.61<@mui/joy.anon.ListItemPropsListItemTypeMaplidefaultCom> extends std.Function ? std.Omit<@mui/joy.anon.ListItemPropsListItemTypeMaplidefaultCom, 'color'> & @mui/joy.anon.61<@mui/joy.anon.ListItemPropsListItemTypeMaplidefaultCom> : {[ K in keyof std.Omit<@mui/joy.anon.ListItemPropsListItemTypeMaplidefaultCom, 'color'> & @mui/joy.anon.61<@mui/joy.anon.ListItemPropsListItemTypeMaplidefaultCom> ]: std.Omit<@mui/joy.anon.ListItemPropsListItemTypeMaplidefaultCom, 'color'> & @mui/joy.anon.61<@mui/joy.anon.ListItemPropsListItemTypeMaplidefaultCom>[K]} */ trait ListItemOwnerState extends StObject {
    
    /**
      * @internal
      * The internal prop for controlling CSS margin of the element.
      */
    var `data-first-child`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the element is rendered in a nested list item.
      */
    var nesting: Boolean | String
    
    /**
      * If `true`, the element is rendered in a horizontal list.
      * @internal
      */
    var row: Boolean
    
    /**
      * If `true`, the element is rendered in a wrapped list.
      * @internal
      */
    var wrap: Boolean
  }
  object ListItemOwnerState {
    
    inline def apply(nesting: Boolean | String, row: Boolean, wrap: Boolean): ListItemOwnerState = {
      val __obj = js.Dynamic.literal(nesting = nesting.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemOwnerState] (val x: Self) extends AnyVal {
      
      inline def `setData-first-child`(value: Boolean): Self = StObject.set(x, "data-first-child", value.asInstanceOf[js.Any])
      
      inline def `setData-first-childUndefined`: Self = StObject.set(x, "data-first-child", js.undefined)
      
      inline def setNesting(value: Boolean | String): Self = StObject.set(x, "nesting", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Boolean): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    }
  }
  
  type ListItemProps[D /* <: ReactElement */, P] = OverrideProps[ListItemTypeMap[P, D], D]
  
  trait ListItemPropsColorOverrides extends StObject
  
  trait ListItemPropsVariantOverrides extends StObject
  
  object ListItemSlot {
    
    inline def endAction: "endAction" = "endAction".asInstanceOf["endAction"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def startAction: "startAction" = "startAction".asInstanceOf["startAction"]
  }
  type ListItemSlot = "root" | "startAction" | "endAction"
  
  trait ListItemSlots extends StObject {
    
    /**
      * The component that renders the end action.
      * @default 'div'
      */
    var endAction: ReactElement
    
    /**
      * The component that renders the root.
      * @default 'li'
      */
    var root: ReactElement
    
    /**
      * The component that renders the start action.
      * @default 'div'
      */
    var startAction: ReactElement
  }
  object ListItemSlots {
    
    inline def apply(endAction: ReactElement, root: ReactElement, startAction: ReactElement): ListItemSlots = {
      val __obj = js.Dynamic.literal(endAction = endAction.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], startAction = startAction.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemSlots]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemSlots] (val x: Self) extends AnyVal {
      
      inline def setEndAction(value: ReactElement): Self = StObject.set(x, "endAction", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: ReactElement): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setStartAction(value: ReactElement): Self = StObject.set(x, "startAction", value.asInstanceOf[js.Any])
    }
  }
  
  type ListItemSlotsAndSlotProps = CreateSlotsAndSlotProps[ListItemSlots, StartAction]
  
  trait ListItemTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & ListItemSlotsAndSlotProps & Nested
  }
  object ListItemTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & ListItemSlotsAndSlotProps & Nested): ListItemTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (ListItemTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & ListItemSlotsAndSlotProps & Nested): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
