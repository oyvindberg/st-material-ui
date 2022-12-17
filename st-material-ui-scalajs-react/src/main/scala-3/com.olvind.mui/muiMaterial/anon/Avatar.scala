package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import com.olvind.mui.muiMaterial.typographyTypographyMod.TypographyProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Avatar[SubheaderTypographyComponent /* <: ElementType */, TitleTypographyComponent /* <: ElementType */] extends StObject {
  
  /**
    * The action to display in the card header.
    */
  var action: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * The Avatar element to display.
    */
  var avatar: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialCardHeaderClasses] = js.undefined
  
  /**
    * If `true`, `subheader` and `title` won't be wrapped by a Typography component.
    * This can be useful to render an alternative Typography variant by wrapping
    * the `title` text, and optional `subheader` text
    * with the Typography component.
    * @default false
    */
  var disableTypography: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The content of the component.
    */
  var subheader: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * These props will be forwarded to the subheader
    * (as long as disableTypography is not `true`).
    */
  var subheaderTypographyProps: js.UndefOr[TypographyProps[SubheaderTypographyComponent, `5`[SubheaderTypographyComponent]]] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[Theme]] = js.undefined
  
  /**
    * The content of the component.
    */
  var title: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * These props will be forwarded to the title
    * (as long as disableTypography is not `true`).
    */
  var titleTypographyProps: js.UndefOr[TypographyProps[TitleTypographyComponent, `6`[TitleTypographyComponent]]] = js.undefined
}
object Avatar {
  
  inline def apply[SubheaderTypographyComponent /* <: ElementType */, TitleTypographyComponent /* <: ElementType */](): Avatar[SubheaderTypographyComponent, TitleTypographyComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Avatar[SubheaderTypographyComponent, TitleTypographyComponent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Avatar[?, ?], SubheaderTypographyComponent /* <: ElementType */, TitleTypographyComponent /* <: ElementType */] (val x: Self & (Avatar[SubheaderTypographyComponent, TitleTypographyComponent])) extends AnyVal {
    
    inline def setAction(value: VdomNode): Self = StObject.set(x, "action", value.rawNode.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActionVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "action", js.Array(value*))
    
    inline def setActionVdomElement(value: VdomElement): Self = StObject.set(x, "action", value.rawElement.asInstanceOf[js.Any])
    
    inline def setAvatar(value: VdomNode): Self = StObject.set(x, "avatar", value.rawNode.asInstanceOf[js.Any])
    
    inline def setAvatarNull: Self = StObject.set(x, "avatar", null)
    
    inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    
    inline def setAvatarVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "avatar", js.Array(value*))
    
    inline def setAvatarVdomElement(value: VdomElement): Self = StObject.set(x, "avatar", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClasses(value: PartialCardHeaderClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setDisableTypography(value: Boolean): Self = StObject.set(x, "disableTypography", value.asInstanceOf[js.Any])
    
    inline def setDisableTypographyUndefined: Self = StObject.set(x, "disableTypography", js.undefined)
    
    inline def setSubheader(value: VdomNode): Self = StObject.set(x, "subheader", value.rawNode.asInstanceOf[js.Any])
    
    inline def setSubheaderNull: Self = StObject.set(x, "subheader", null)
    
    inline def setSubheaderTypographyProps(value: TypographyProps[SubheaderTypographyComponent, `5`[SubheaderTypographyComponent]]): Self = StObject.set(x, "subheaderTypographyProps", value.asInstanceOf[js.Any])
    
    inline def setSubheaderTypographyPropsUndefined: Self = StObject.set(x, "subheaderTypographyProps", js.undefined)
    
    inline def setSubheaderUndefined: Self = StObject.set(x, "subheader", js.undefined)
    
    inline def setSubheaderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "subheader", js.Array(value*))
    
    inline def setSubheaderVdomElement(value: VdomElement): Self = StObject.set(x, "subheader", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSx(value: SxProps[Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSxFunction1(value: Theme => SystemStyleObject[Theme]): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    inline def setSxNull: Self = StObject.set(x, "sx", null)
    
    inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    inline def setSxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): Self = StObject.set(x, "sx", js.Array(value*))
    
    inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleTypographyProps(value: TypographyProps[TitleTypographyComponent, `6`[TitleTypographyComponent]]): Self = StObject.set(x, "titleTypographyProps", value.asInstanceOf[js.Any])
    
    inline def setTitleTypographyPropsUndefined: Self = StObject.set(x, "titleTypographyProps", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
    
    inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
  }
}
