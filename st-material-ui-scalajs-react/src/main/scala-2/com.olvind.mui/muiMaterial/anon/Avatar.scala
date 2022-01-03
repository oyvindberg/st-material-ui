package com.olvind.mui.muiMaterial.anon

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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Avatar[SubheaderTypographyComponent /* <: ElementType */, TitleTypographyComponent /* <: ElementType */] extends StObject {
  
  /**
    * The action to display in the card header.
    */
  var action: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.native
  
  /**
    * The Avatar element to display.
    */
  var avatar: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.native
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialCardHeaderClasses] = js.native
  
  /**
    * If `true`, `subheader` and `title` won't be wrapped by a Typography component.
    * This can be useful to render an alternative Typography variant by wrapping
    * the `title` text, and optional `subheader` text
    * with the Typography component.
    * @default false
    */
  var disableTypography: js.UndefOr[Boolean] = js.native
  
  /**
    * The content of the component.
    */
  var subheader: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.native
  
  /**
    * These props will be forwarded to the subheader
    * (as long as disableTypography is not `true`).
    */
  var subheaderTypographyProps: js.UndefOr[TypographyProps[SubheaderTypographyComponent, `6`[SubheaderTypographyComponent]]] = js.native
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.native
  
  /**
    * The content of the component.
    */
  var title: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.native
  
  /**
    * These props will be forwarded to the title
    * (as long as disableTypography is not `true`).
    */
  var titleTypographyProps: js.UndefOr[TypographyProps[TitleTypographyComponent, `7`[TitleTypographyComponent]]] = js.native
}
object Avatar {
  
  @scala.inline
  def apply[SubheaderTypographyComponent /* <: ElementType */, TitleTypographyComponent /* <: ElementType */](): Avatar[SubheaderTypographyComponent, TitleTypographyComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Avatar[SubheaderTypographyComponent, TitleTypographyComponent]]
  }
  
  @scala.inline
  implicit class AvatarMutableBuilder[Self <: Avatar[_, _], SubheaderTypographyComponent /* <: ElementType */, TitleTypographyComponent /* <: ElementType */] (val x: Self with (Avatar[SubheaderTypographyComponent, TitleTypographyComponent])) extends AnyVal {
    
    @scala.inline
    def setAction(value: VdomNode): Self = StObject.set(x, "action", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionNull: Self = StObject.set(x, "action", null)
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setActionVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "action", js.Array(value :_*))
    
    @scala.inline
    def setActionVdomElement(value: VdomElement): Self = StObject.set(x, "action", value.rawElement.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvatar(value: VdomNode): Self = StObject.set(x, "avatar", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvatarNull: Self = StObject.set(x, "avatar", null)
    
    @scala.inline
    def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    
    @scala.inline
    def setAvatarVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "avatar", js.Array(value :_*))
    
    @scala.inline
    def setAvatarVdomElement(value: VdomElement): Self = StObject.set(x, "avatar", value.rawElement.asInstanceOf[js.Any])
    
    @scala.inline
    def setClasses(value: PartialCardHeaderClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setDisableTypography(value: Boolean): Self = StObject.set(x, "disableTypography", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableTypographyUndefined: Self = StObject.set(x, "disableTypography", js.undefined)
    
    @scala.inline
    def setSubheader(value: VdomNode): Self = StObject.set(x, "subheader", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubheaderNull: Self = StObject.set(x, "subheader", null)
    
    @scala.inline
    def setSubheaderTypographyProps(value: TypographyProps[SubheaderTypographyComponent, `6`[SubheaderTypographyComponent]]): Self = StObject.set(x, "subheaderTypographyProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubheaderTypographyPropsUndefined: Self = StObject.set(x, "subheaderTypographyProps", js.undefined)
    
    @scala.inline
    def setSubheaderUndefined: Self = StObject.set(x, "subheader", js.undefined)
    
    @scala.inline
    def setSubheaderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "subheader", js.Array(value :_*))
    
    @scala.inline
    def setSubheaderVdomElement(value: VdomElement): Self = StObject.set(x, "subheader", value.rawElement.asInstanceOf[js.Any])
    
    @scala.inline
    def setSx(value: SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSxFunction1(
      value: com.olvind.mui.muiMaterial.createThemeMod.Theme => SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme]
    ): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSxNull: Self = StObject.set(x, "sx", null)
    
    @scala.inline
    def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    @scala.inline
    def setSxVarargs(
      value: (Boolean | SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme] | (js.Function1[
          com.olvind.mui.muiMaterial.createThemeMod.Theme, 
          SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme]
        ]))*
    ): Self = StObject.set(x, "sx", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleNull: Self = StObject.set(x, "title", null)
    
    @scala.inline
    def setTitleTypographyProps(value: TypographyProps[TitleTypographyComponent, `7`[TitleTypographyComponent]]): Self = StObject.set(x, "titleTypographyProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTypographyPropsUndefined: Self = StObject.set(x, "titleTypographyProps", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value :_*))
    
    @scala.inline
    def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
  }
}
