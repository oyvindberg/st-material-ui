package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsFormLabelTypeMaplab
import com.olvind.mui.muiMaterial.anon.PartialFormLabelClasses
import com.olvind.mui.muiMaterial.anon.PickFormLabelOwnPropsfilledcolor
import com.olvind.mui.muiMaterial.overridableComponentMod.OverridableTypeMap
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.react.mod.LabelHTMLAttributes
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLLabelElement
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formLabelFormLabelMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Checkbox](https://mui.com/material-ui/react-checkbox/)
    * - [Radio Group](https://mui.com/material-ui/react-radio-button/)
    * - [Switch](https://mui.com/material-ui/react-switch/)
    *
    * API:
    *
    * - [FormLabel API](https://mui.com/material-ui/api/form-label/)
    */
  @JSImport("@mui/material/FormLabel/FormLabel", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsFormLabelTypeMaplab, Element] = js.native
  
  trait ExtendFormLabelTypeMap[M /* <: OverridableTypeMap */] extends StObject {
    
    var defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
    
    var props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & PickFormLabelOwnPropsfilledcolor
  }
  object ExtendFormLabelTypeMap {
    
    inline def apply[M /* <: OverridableTypeMap */](
      defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any,
      props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & PickFormLabelOwnPropsfilledcolor
    ): ExtendFormLabelTypeMap[M] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendFormLabelTypeMap[M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtendFormLabelTypeMap[?], M /* <: OverridableTypeMap */] (val x: Self & ExtendFormLabelTypeMap[M]) extends AnyVal {
      
      inline def setDefaultComponent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
      ): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & PickFormLabelOwnPropsfilledcolor
      ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type FormLabelBaseProps = LabelHTMLAttributes[HTMLLabelElement]
  
  trait FormLabelOwnProps extends StObject {
    
    /**
      * The content of the component.
      */
    var children: js.UndefOr[ReactElement] = js.undefined
    
    /**
      * Override or extend the styles applied to the component.
      */
    var classes: js.UndefOr[PartialFormLabelClasses] = js.undefined
    
    /**
      * The color of the component.
      * It supports both default and custom theme colors, which can be added as shown in the
      * [palette customization guide](https://mui.com/material-ui/customization/palette/#adding-new-colors).
      */
    var color: js.UndefOr["primary" | "secondary" | "error" | "info" | "success" | "warning"] = js.undefined
    
    /**
      * If `true`, the label should be displayed in a disabled state.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the label is displayed in an error state.
      */
    var error: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the label should use filled classes key.
      */
    var filled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the input of this label is focused (used by `FormGroup` components).
      */
    var focused: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the label will indicate that the `input` is required.
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The system prop that allows defining system overrides as well as additional CSS styles.
      */
    var sx: js.UndefOr[SxProps[Theme]] = js.undefined
  }
  object FormLabelOwnProps {
    
    inline def apply(): FormLabelOwnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormLabelOwnProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormLabelOwnProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClasses(value: PartialFormLabelClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setColor(value: "primary" | "secondary" | "error" | "info" | "success" | "warning"): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFilled(value: Boolean): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
      
      inline def setFilledUndefined: Self = StObject.set(x, "filled", js.undefined)
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSx(value: SxProps[Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxFunction1(value: Theme => SystemStyleObject[Theme]): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
      
      inline def setSxNull: Self = StObject.set(x, "sx", null)
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      inline def setSxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): Self = StObject.set(x, "sx", js.Array(value*))
    }
  }
  
  type FormLabelProps[D /* <: ReactElement */, P] = OverrideProps[FormLabelTypeMap[P, D], D]
  
  trait FormLabelPropsColorOverrides extends StObject
  
  trait FormLabelTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & FormLabelBaseProps & FormLabelOwnProps
  }
  object FormLabelTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & FormLabelBaseProps & FormLabelOwnProps): FormLabelTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormLabelTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormLabelTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (FormLabelTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & FormLabelBaseProps & FormLabelOwnProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsFormLabelTypeMaplab, Element]
  
  /* This means you don't have to write `default`, but can instead just say `formLabelFormLabelMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsFormLabelTypeMaplab, Element] = default
}
