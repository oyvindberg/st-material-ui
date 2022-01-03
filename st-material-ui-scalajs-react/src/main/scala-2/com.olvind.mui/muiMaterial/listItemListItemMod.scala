package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Components
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAlignItems
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsListItemTypeMapli
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapList
import com.olvind.mui.muiMaterial.anon.PartialListItemClasses
import com.olvind.mui.muiMaterial.createThemeMod.Theme
import com.olvind.mui.muiMaterial.muiMaterialStrings.`flex-start`
import com.olvind.mui.muiMaterial.muiMaterialStrings.center
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.react.mod.HTMLAttributes
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemListItemMod extends Shortcut {
  
  /**
    * Uses an additional container component if `ListItemSecondaryAction` is the last child.
    *
    * Demos:
    *
    * - [Lists](https://mui.com/components/lists/)
    * - [Transfer List](https://mui.com/components/transfer-list/)
    *
    * API:
    *
    * - [ListItem API](https://mui.com/api/list-item/)
    */
  @JSImport("@mui/material/ListItem/ListItem", JSImport.Default)
  @js.native
  val default: (js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapList | DefaultComponentPropsExtendButtonBaseTypAlignItems, 
    Element | Null
  ]) with (js.Function1[
    /* props */ DefaultComponentPropsListItemTypeMapli, 
    com.olvind.mui.react.mod.global.JSX.Element
  ]) = js.native
  
  @js.native
  trait ListItemBaseProps extends StObject {
    
    /**
      * The container component used when a `ListItemSecondaryAction` is the last child.
      * @default 'li'
      * @deprecated
      */
    var ContainerComponent: js.UndefOr[ElementType] = js.native
    
    /**
      * Props applied to the container component if used.
      * @default {}
      * @deprecated
      */
    var ContainerProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
    
    /**
      * Defines the `align-items` style property.
      * @default 'center'
      */
    var alignItems: js.UndefOr[`flex-start` | center] = js.native
    
    /**
      * If `true`, the list item is focused during the first mount.
      * Focus will also be triggered if the value changes from false to true.
      * @default false
      * @deprecated checkout [ListItemButton](/api/list-item-button/) instead
      */
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    /**
      * The content of the component if a `ListItemSecondaryAction` is used it must
      * be the last child.
      */
    var children: js.UndefOr[Node] = js.native
    
    /**
      * Override or extend the styles applied to the component.
      */
    var classes: js.UndefOr[PartialListItemClasses] = js.native
    
    /**
      * If `true`, compact vertical padding designed for keyboard and mouse input is used.
      * The prop defaults to the value inherited from the parent List component.
      * @default false
      */
    var dense: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, the left and right padding is removed.
      * @default false
      */
    var disableGutters: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, all padding is removed.
      * @default false
      */
    var disablePadding: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, the component is disabled.
      * @default false
      * @deprecated checkout [ListItemButton](/api/list-item-button/) instead
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, a 1px light border is added to the bottom of the list item.
      * @default false
      */
    var divider: js.UndefOr[Boolean] = js.native
    
    /**
      * The element to display at the end of ListItem.
      */
    var secondaryAction: js.UndefOr[Node] = js.native
    
    /**
      * Use to apply selected styling.
      * @default false
      * @deprecated checkout [ListItemButton](/api/list-item-button/) instead
      */
    var selected: js.UndefOr[Boolean] = js.native
    
    /**
      * The system prop that allows defining system overrides as well as additional CSS styles.
      */
    var sx: js.UndefOr[SxProps[Theme]] = js.native
  }
  object ListItemBaseProps {
    
    @scala.inline
    def apply(): ListItemBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemBaseProps]
    }
    
    @scala.inline
    implicit class ListItemBasePropsMutableBuilder[Self <: ListItemBaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignItems(value: `flex-start` | center): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenNull: Self = StObject.set(x, "children", null)
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      @scala.inline
      def setClasses(value: PartialListItemClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setContainerComponent(value: ElementType): Self = StObject.set(x, "ContainerComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerComponentUndefined: Self = StObject.set(x, "ContainerComponent", js.undefined)
      
      @scala.inline
      def setContainerProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "ContainerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerPropsUndefined: Self = StObject.set(x, "ContainerProps", js.undefined)
      
      @scala.inline
      def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
      
      @scala.inline
      def setDisableGutters(value: Boolean): Self = StObject.set(x, "disableGutters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableGuttersUndefined: Self = StObject.set(x, "disableGutters", js.undefined)
      
      @scala.inline
      def setDisablePadding(value: Boolean): Self = StObject.set(x, "disablePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisablePaddingUndefined: Self = StObject.set(x, "disablePadding", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDivider(value: Boolean): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      @scala.inline
      def setSecondaryAction(value: VdomNode): Self = StObject.set(x, "secondaryAction", value.rawNode.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryActionNull: Self = StObject.set(x, "secondaryAction", null)
      
      @scala.inline
      def setSecondaryActionUndefined: Self = StObject.set(x, "secondaryAction", js.undefined)
      
      @scala.inline
      def setSecondaryActionVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "secondaryAction", js.Array(value :_*))
      
      @scala.inline
      def setSecondaryActionVdomElement(value: VdomElement): Self = StObject.set(x, "secondaryAction", value.rawElement.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setSx(value: SxProps[Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSxFunction1(value: Theme => SystemStyleObject[Theme]): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSxNull: Self = StObject.set(x, "sx", null)
      
      @scala.inline
      def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      @scala.inline
      def setSxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): Self = StObject.set(x, "sx", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ListItemComponentsPropsOverrides extends StObject
  
  type ListItemProps[D /* <: ElementType */, P] = OverrideProps[ListItemTypeMap[P, D], D]
  
  @js.native
  trait ListItemTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D = js.native
    
    var props: P with ListItemBaseProps with Components = js.native
  }
  object ListItemTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ElementType */](defaultComponent: D, props: P with ListItemBaseProps with Components): ListItemTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class ListItemTypeMapMutableBuilder[Self <: ListItemTypeMap[_, _], P, D /* <: ElementType */] (val x: Self with (ListItemTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with ListItemBaseProps with Components): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = (js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapList | DefaultComponentPropsExtendButtonBaseTypAlignItems, 
    Element | Null
  ]) with (js.Function1[
    /* props */ DefaultComponentPropsListItemTypeMapli, 
    com.olvind.mui.react.mod.global.JSX.Element
  ])
  
  /* This means you don't have to write `default`, but can instead just say `listItemListItemMod.foo` */
  override def _to: (js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapList | DefaultComponentPropsExtendButtonBaseTypAlignItems, 
    Element | Null
  ]) with (js.Function1[
    /* props */ DefaultComponentPropsListItemTypeMapli, 
    com.olvind.mui.react.mod.global.JSX.Element
  ]) = default
}
