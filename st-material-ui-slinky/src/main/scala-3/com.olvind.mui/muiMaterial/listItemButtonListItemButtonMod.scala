package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriabusy
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapListAbout
import com.olvind.mui.muiMaterial.anon.PartialListItemButtonClasses
import com.olvind.mui.muiMaterial.anon.`16`
import com.olvind.mui.muiMaterial.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemButtonListItemButtonMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Lists](https://mui.com/material-ui/react-list/)
    *
    * API:
    *
    * - [ListItemButton API](https://mui.com/material-ui/api/list-item-button/)
    * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
    */
  @JSImport("@mui/material/ListItemButton/ListItemButton", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapListAbout | DefaultComponentPropsExtendButtonBaseTypAriabusy, 
    ReactElement | Null
  ] = js.native
  
  trait ListItemButtonBaseProps extends StObject {
    
    /**
      * Defines the `align-items` style property.
      * @default 'center'
      */
    var alignItems: js.UndefOr["flex-start" | "center"] = js.undefined
    
    /**
      * If `true`, the list item is focused during the first mount.
      * Focus will also be triggered if the value changes from false to true.
      * @default false
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
    var classes: js.UndefOr[PartialListItemButtonClasses] = js.undefined
    
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
      * If `true`, the component is disabled.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, a 1px light border is added to the bottom of the list item.
      * @default false
      */
    var divider: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use to apply selected styling.
      * @default false
      */
    var selected: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The system prop that allows defining system overrides as well as additional CSS styles.
      */
    var sx: js.UndefOr[SxProps[Theme]] = js.undefined
  }
  object ListItemButtonBaseProps {
    
    inline def apply(): ListItemButtonBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemButtonBaseProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemButtonBaseProps] (val x: Self) extends AnyVal {
      
      inline def setAlignItems(value: "flex-start" | "center"): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClasses(value: PartialListItemButtonClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
      
      inline def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
      
      inline def setDisableGutters(value: Boolean): Self = StObject.set(x, "disableGutters", value.asInstanceOf[js.Any])
      
      inline def setDisableGuttersUndefined: Self = StObject.set(x, "disableGutters", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDivider(value: Boolean): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      inline def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSx(value: SxProps[Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxFunction1(value: Theme => SystemStyleObject[Theme]): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
      
      inline def setSxNull: Self = StObject.set(x, "sx", null)
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      inline def setSxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): Self = StObject.set(x, "sx", js.Array(value*))
    }
  }
  
  type ListItemButtonProps[D /* <: ReactElement */, P] = OverrideProps[ListItemButtonTypeMap[P, D], D]
  
  type ListItemButtonTypeMap[P, D /* <: ReactElement */] = ExtendButtonBaseTypeMap[`16`[P, D]]
  
  type _To = js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapListAbout | DefaultComponentPropsExtendButtonBaseTypAriabusy, 
    ReactElement | Null
  ]
  
  /* This means you don't have to write `default`, but can instead just say `listItemButtonListItemButtonMod.foo` */
  override def _to: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapListAbout | DefaultComponentPropsExtendButtonBaseTypAriabusy, 
    ReactElement | Null
  ] = default
}
