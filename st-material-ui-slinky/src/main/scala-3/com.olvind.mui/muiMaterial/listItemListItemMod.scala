package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.ComponentsProps
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAlignItems
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsListItemTypeMapli
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapList
import com.olvind.mui.muiMaterial.anon.PartialListItemClasses
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.react.mod.HTMLAttributes
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemListItemMod extends Shortcut {
  
  /**
    * Uses an additional container component if `ListItemSecondaryAction` is the last child.
    *
    * Demos:
    *
    * - [Lists](https://mui.com/material-ui/react-list/)
    * - [Transfer List](https://mui.com/material-ui/react-transfer-list/)
    *
    * API:
    *
    * - [ListItem API](https://mui.com/material-ui/api/list-item/)
    */
  @JSImport("@mui/material/ListItem/ListItem", JSImport.Default)
  @js.native
  val default: (js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapList | DefaultComponentPropsExtendButtonBaseTypAlignItems, 
    ReactElement | Null
  ]) & (js.Function1[/* props */ DefaultComponentPropsListItemTypeMapli, Element]) = js.native
  
  trait ListItemBaseProps extends StObject {
    
    /**
      * The container component used when a `ListItemSecondaryAction` is the last child.
      * @default 'li'
      * @deprecated
      */
    var ContainerComponent: js.UndefOr[ReactElement] = js.undefined
    
    /**
      * Props applied to the container component if used.
      * @default {}
      * @deprecated
      */
    var ContainerProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
    
    /**
      * Defines the `align-items` style property.
      * @default 'center'
      */
    var alignItems: js.UndefOr["flex-start" | "center"] = js.undefined
    
    /**
      * If `true`, the list item is focused during the first mount.
      * Focus will also be triggered if the value changes from false to true.
      * @default false
      * @deprecated checkout [ListItemButton](/material-ui/api/list-item-button/) instead
      */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The content of the component if a `ListItemSecondaryAction` is used it must
      * be the last child.
      */
    var children: js.UndefOr[ReactElement] = js.undefined
    
    /**
      * Override or extend the styles applied to the component.
      */
    var classes: js.UndefOr[PartialListItemClasses] = js.undefined
    
    /**
      * If `true`, compact vertical padding designed for keyboard and mouse input is used.
      * The prop defaults to the value inherited from the parent List component.
      * @default false
      */
    var dense: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the left and right padding is removed.
      * @default false
      */
    var disableGutters: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, all padding is removed.
      * @default false
      */
    var disablePadding: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the component is disabled.
      * @default false
      * @deprecated checkout [ListItemButton](/material-ui/api/list-item-button/) instead
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, a 1px light border is added to the bottom of the list item.
      * @default false
      */
    var divider: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The element to display at the end of ListItem.
      */
    var secondaryAction: js.UndefOr[ReactElement] = js.undefined
    
    /**
      * Use to apply selected styling.
      * @default false
      * @deprecated checkout [ListItemButton](/material-ui/api/list-item-button/) instead
      */
    var selected: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The system prop that allows defining system overrides as well as additional CSS styles.
      */
    var sx: js.UndefOr[SxProps[Theme]] = js.undefined
  }
  object ListItemBaseProps {
    
    inline def apply(): ListItemBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemBaseProps]
    }
    
    extension [Self <: ListItemBaseProps](x: Self) {
      
      inline def setAlignItems(value: "flex-start" | "center"): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClasses(value: PartialListItemClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setContainerComponent(value: ReactElement): Self = StObject.set(x, "ContainerComponent", value.asInstanceOf[js.Any])
      
      inline def setContainerComponentUndefined: Self = StObject.set(x, "ContainerComponent", js.undefined)
      
      inline def setContainerProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "ContainerProps", value.asInstanceOf[js.Any])
      
      inline def setContainerPropsUndefined: Self = StObject.set(x, "ContainerProps", js.undefined)
      
      inline def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
      
      inline def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
      
      inline def setDisableGutters(value: Boolean): Self = StObject.set(x, "disableGutters", value.asInstanceOf[js.Any])
      
      inline def setDisableGuttersUndefined: Self = StObject.set(x, "disableGutters", js.undefined)
      
      inline def setDisablePadding(value: Boolean): Self = StObject.set(x, "disablePadding", value.asInstanceOf[js.Any])
      
      inline def setDisablePaddingUndefined: Self = StObject.set(x, "disablePadding", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDivider(value: Boolean): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      inline def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      inline def setSecondaryAction(value: ReactElement): Self = StObject.set(x, "secondaryAction", value.asInstanceOf[js.Any])
      
      inline def setSecondaryActionUndefined: Self = StObject.set(x, "secondaryAction", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSx(value: SxProps[Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxFunction1(value: Theme => SystemStyleObject[Theme]): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
      
      inline def setSxNull: Self = StObject.set(x, "sx", null)
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      inline def setSxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): Self = StObject.set(x, "sx", js.Array(value*))
    }
  }
  
  trait ListItemComponentsPropsOverrides extends StObject
  
  type ListItemProps[D /* <: ReactElement */, P] = OverrideProps[ListItemTypeMap[P, D], D]
  
  trait ListItemTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & ListItemBaseProps & ComponentsProps
  }
  object ListItemTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & ListItemBaseProps & ComponentsProps): ListItemTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemTypeMap[P, D]]
    }
    
    extension [Self <: ListItemTypeMap[?, ?], P, D /* <: ReactElement */](x: Self & (ListItemTypeMap[P, D])) {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & ListItemBaseProps & ComponentsProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = (js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapList | DefaultComponentPropsExtendButtonBaseTypAlignItems, 
    ReactElement | Null
  ]) & (js.Function1[/* props */ DefaultComponentPropsListItemTypeMapli, Element])
  
  /* This means you don't have to write `default`, but can instead just say `listItemListItemMod.foo` */
  override def _to: (js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapList | DefaultComponentPropsExtendButtonBaseTypAlignItems, 
    ReactElement | Null
  ]) & (js.Function1[/* props */ DefaultComponentPropsListItemTypeMapli, Element]) = default
}
