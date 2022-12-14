package com.olvind.mui.std

import org.scalajs.dom.Attr
import org.scalajs.dom.DOMRect
import org.scalajs.dom.DOMTokenList
import org.scalajs.dom.Document
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLAreaElement
import org.scalajs.dom.HTMLAudioElement
import org.scalajs.dom.HTMLBRElement
import org.scalajs.dom.HTMLBaseElement
import org.scalajs.dom.HTMLBodyElement
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLDListElement
import org.scalajs.dom.HTMLDataListElement
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLEmbedElement
import org.scalajs.dom.HTMLFieldSetElement
import org.scalajs.dom.HTMLFormElement
import org.scalajs.dom.HTMLHRElement
import org.scalajs.dom.HTMLHeadElement
import org.scalajs.dom.HTMLHeadingElement
import org.scalajs.dom.HTMLHtmlElement
import org.scalajs.dom.HTMLIFrameElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLLIElement
import org.scalajs.dom.HTMLLabelElement
import org.scalajs.dom.HTMLLegendElement
import org.scalajs.dom.HTMLLinkElement
import org.scalajs.dom.HTMLMapElement
import org.scalajs.dom.HTMLMenuElement
import org.scalajs.dom.HTMLMetaElement
import org.scalajs.dom.HTMLModElement
import org.scalajs.dom.HTMLOListElement
import org.scalajs.dom.HTMLObjectElement
import org.scalajs.dom.HTMLOptGroupElement
import org.scalajs.dom.HTMLOptionElement
import org.scalajs.dom.HTMLParagraphElement
import org.scalajs.dom.HTMLParamElement
import org.scalajs.dom.HTMLPreElement
import org.scalajs.dom.HTMLProgressElement
import org.scalajs.dom.HTMLQuoteElement
import org.scalajs.dom.HTMLScriptElement
import org.scalajs.dom.HTMLSelectElement
import org.scalajs.dom.HTMLSourceElement
import org.scalajs.dom.HTMLSpanElement
import org.scalajs.dom.HTMLStyleElement
import org.scalajs.dom.HTMLTableCaptionElement
import org.scalajs.dom.HTMLTableColElement
import org.scalajs.dom.HTMLTableElement
import org.scalajs.dom.HTMLTableRowElement
import org.scalajs.dom.HTMLTableSectionElement
import org.scalajs.dom.HTMLTextAreaElement
import org.scalajs.dom.HTMLTitleElement
import org.scalajs.dom.HTMLTrackElement
import org.scalajs.dom.HTMLUListElement
import org.scalajs.dom.HTMLVideoElement
import org.scalajs.dom.NamedNodeMap
import org.scalajs.dom.SVGCircleElement
import org.scalajs.dom.SVGClipPathElement
import org.scalajs.dom.SVGDefsElement
import org.scalajs.dom.SVGDescElement
import org.scalajs.dom.SVGEllipseElement
import org.scalajs.dom.SVGFEBlendElement
import org.scalajs.dom.SVGFEColorMatrixElement
import org.scalajs.dom.SVGFEComponentTransferElement
import org.scalajs.dom.SVGFECompositeElement
import org.scalajs.dom.SVGFEConvolveMatrixElement
import org.scalajs.dom.SVGFEDiffuseLightingElement
import org.scalajs.dom.SVGFEDisplacementMapElement
import org.scalajs.dom.SVGFEDistantLightElement
import org.scalajs.dom.SVGFEFloodElement
import org.scalajs.dom.SVGFEFuncAElement
import org.scalajs.dom.SVGFEFuncBElement
import org.scalajs.dom.SVGFEFuncGElement
import org.scalajs.dom.SVGFEFuncRElement
import org.scalajs.dom.SVGFEGaussianBlurElement
import org.scalajs.dom.SVGFEImageElement
import org.scalajs.dom.SVGFEMergeElement
import org.scalajs.dom.SVGFEMergeNodeElement
import org.scalajs.dom.SVGFEMorphologyElement
import org.scalajs.dom.SVGFEOffsetElement
import org.scalajs.dom.SVGFEPointLightElement
import org.scalajs.dom.SVGFESpecularLightingElement
import org.scalajs.dom.SVGFESpotLightElement
import org.scalajs.dom.SVGFETileElement
import org.scalajs.dom.SVGFETurbulenceElement
import org.scalajs.dom.SVGFilterElement
import org.scalajs.dom.SVGGElement
import org.scalajs.dom.SVGImageElement
import org.scalajs.dom.SVGLineElement
import org.scalajs.dom.SVGLinearGradientElement
import org.scalajs.dom.SVGMarkerElement
import org.scalajs.dom.SVGMaskElement
import org.scalajs.dom.SVGMetadataElement
import org.scalajs.dom.SVGPathElement
import org.scalajs.dom.SVGPatternElement
import org.scalajs.dom.SVGPolygonElement
import org.scalajs.dom.SVGPolylineElement
import org.scalajs.dom.SVGRadialGradientElement
import org.scalajs.dom.SVGRectElement
import org.scalajs.dom.SVGSVGElement
import org.scalajs.dom.SVGStopElement
import org.scalajs.dom.SVGSwitchElement
import org.scalajs.dom.SVGSymbolElement
import org.scalajs.dom.SVGTSpanElement
import org.scalajs.dom.SVGTextElement
import org.scalajs.dom.SVGTextPathElement
import org.scalajs.dom.SVGUseElement
import org.scalajs.dom.SVGViewElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Element is the most general base class from which all objects in a Document inherit. It only has methods and properties common to all kinds of elements. More specific classes inherit from Element. */
@js.native
trait Element
  extends StObject
     with Animatable
     with ChildNode
     with InnerHTML
     with NonDocumentTypeChildNode
     with ParentNode
     with Slottable {
  
  /* standard dom */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_fullscreenchange")
  def addEventListener(
    `type`: "fullscreenchange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_fullscreenerror")
  def addEventListener(
    `type`: "fullscreenerror",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_fullscreenchange")
  def addEventListener(
    `type`: "fullscreenchange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_fullscreenerror")
  def addEventListener(
    `type`: "fullscreenerror",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_fullscreenchange")
  def addEventListener(
    `type`: "fullscreenchange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_fullscreenerror")
  def addEventListener(
    `type`: "fullscreenerror",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: Boolean
  ): Unit = js.native
  
  /**
    * Creates a shadow root for element and returns it.
    */
  /* standard dom */
  def attachShadow(init: ShadowRootInit): ShadowRoot = js.native
  
  /* standard dom */
  val attributes: NamedNodeMap = js.native
  
  /**
    * Allows for manipulation of element's class content attribute as a set of whitespace-separated tokens through a DOMTokenList object.
    */
  /* standard dom */
  val classList: DOMTokenList = js.native
  
  /**
    * Returns the value of element's class content attribute. Can be set to change it.
    */
  /* standard dom */
  var className: java.lang.String = js.native
  
  /* standard dom */
  val clientHeight: Double = js.native
  
  /* standard dom */
  val clientLeft: Double = js.native
  
  /* standard dom */
  val clientTop: Double = js.native
  
  /* standard dom */
  val clientWidth: Double = js.native
  
  @JSName("closest")
  @scala.annotation.targetName("closest_b")
  def closest(selector: "b"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_feDistantLight")
  def closest(selector: "feDistantLight"): SVGFEDistantLightElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_samp")
  def closest(selector: "samp"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_input")
  def closest(selector: "input"): HTMLInputElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_rp")
  def closest(selector: "rp"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_embed")
  def closest(selector: "embed"): HTMLEmbedElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_p")
  def closest(selector: "p"): HTMLParagraphElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_mark")
  def closest(selector: "mark"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_textarea")
  def closest(selector: "textarea"): HTMLTextAreaElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_button")
  def closest(selector: "button"): HTMLButtonElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_source")
  def closest(selector: "source"): HTMLSourceElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_wbr")
  def closest(selector: "wbr"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_del")
  def closest(selector: "del"): HTMLModElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_table")
  def closest(selector: "table"): HTMLTableElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_h4")
  def closest(selector: "h4"): HTMLHeadingElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_feFlood")
  def closest(selector: "feFlood"): SVGFEFloodElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_noscript")
  def closest(selector: "noscript"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_link")
  def closest(selector: "link"): HTMLLinkElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_sub")
  def closest(selector: "sub"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_section")
  def closest(selector: "section"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_menu")
  def closest(selector: "menu"): HTMLMenuElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_circle")
  def closest(selector: "circle"): SVGCircleElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_ins")
  def closest(selector: "ins"): HTMLModElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_fieldset")
  def closest(selector: "fieldset"): HTMLFieldSetElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_blockquote")
  def closest(selector: "blockquote"): HTMLQuoteElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_var")
  def closest(selector: "var"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_defs")
  def closest(selector: "defs"): SVGDefsElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_figure")
  def closest(selector: "figure"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_h6")
  def closest(selector: "h6"): HTMLHeadingElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_stop")
  def closest(selector: "stop"): SVGStopElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_canvas")
  def closest(selector: "canvas"): HTMLCanvasElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_picture")
  def closest(selector: "picture"): HTMLPictureElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_feBlend")
  def closest(selector: "feBlend"): SVGFEBlendElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_datalist")
  def closest(selector: "datalist"): HTMLDataListElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_fePointLight")
  def closest(selector: "fePointLight"): SVGFEPointLightElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_html")
  def closest(selector: "html"): HTMLHtmlElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_sup")
  def closest(selector: "sup"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_marquee")
  def closest(selector: "marquee"): HTMLMarqueeElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_dd")
  def closest(selector: "dd"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_g")
  def closest(selector: "g"): SVGGElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_ol")
  def closest(selector: "ol"): HTMLOListElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_base")
  def closest(selector: "base"): HTMLBaseElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_img")
  def closest(selector: "img"): HTMLImageElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_polygon")
  def closest(selector: "polygon"): SVGPolygonElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_polyline")
  def closest(selector: "polyline"): SVGPolylineElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_ellipse")
  def closest(selector: "ellipse"): SVGEllipseElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_feTile")
  def closest(selector: "feTile"): SVGFETileElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_style")
  def closest(selector: "style"): HTMLStyleElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_aside")
  def closest(selector: "aside"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_linearGradient")
  def closest(selector: "linearGradient"): SVGLinearGradientElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_output")
  def closest(selector: "output"): HTMLOutputElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_feMorphology")
  def closest(selector: "feMorphology"): SVGFEMorphologyElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_template")
  def closest(selector: "template"): HTMLTemplateElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_summary")
  def closest(selector: "summary"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_code")
  def closest(selector: "code"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_pre")
  def closest(selector: "pre"): HTMLPreElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_feDisplacementMap")
  def closest(selector: "feDisplacementMap"): SVGFEDisplacementMapElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_tbody")
  def closest(selector: "tbody"): HTMLTableSectionElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_feConvolveMatrix")
  def closest(selector: "feConvolveMatrix"): SVGFEConvolveMatrixElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_feFuncA")
  def closest(selector: "feFuncA"): SVGFEFuncAElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_option")
  def closest(selector: "option"): HTMLOptionElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_textPath")
  def closest(selector: "textPath"): SVGTextPathElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_switch")
  def closest(selector: "switch"): SVGSwitchElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_dfn")
  def closest(selector: "dfn"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_optgroup")
  def closest(selector: "optgroup"): HTMLOptGroupElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_th")
  def closest(selector: "th"): HTMLTableHeaderCellElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_line")
  def closest(selector: "line"): SVGLineElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_u")
  def closest(selector: "u"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_slot")
  def closest(selector: "slot"): HTMLSlotElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_q")
  def closest(selector: "q"): HTMLQuoteElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_col")
  def closest(selector: "col"): HTMLTableColElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_applet")
  def closest(selector: "applet"): HTMLAppletElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_object")
  def closest(selector: "object"): HTMLObjectElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_bdo")
  def closest(selector: "bdo"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_abbr")
  def closest(selector: "abbr"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_path")
  def closest(selector: "path"): SVGPathElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_h2")
  def closest(selector: "h2"): HTMLHeadingElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_rect")
  def closest(selector: "rect"): SVGRectElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_ul")
  def closest(selector: "ul"): HTMLUListElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_head")
  def closest(selector: "head"): HTMLHeadElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_area")
  def closest(selector: "area"): HTMLAreaElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_select")
  def closest(selector: "select"): HTMLSelectElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_rt")
  def closest(selector: "rt"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_frameset")
  def closest(selector: "frameset"): HTMLFrameSetElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_figcaption")
  def closest(selector: "figcaption"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_feGaussianBlur")
  def closest(selector: "feGaussianBlur"): SVGFEGaussianBlurElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_feDiffuseLighting")
  def closest(selector: "feDiffuseLighting"): SVGFEDiffuseLightingElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_dialog")
  def closest(selector: "dialog"): HTMLDialogElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_feFuncB")
  def closest(selector: "feFuncB"): SVGFEFuncBElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_feComponentTransfer")
  def closest(selector: "feComponentTransfer"): SVGFEComponentTransferElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_data")
  def closest(selector: "data"): HTMLDataElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_feComposite")
  def closest(selector: "feComposite"): SVGFECompositeElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_dl")
  def closest(selector: "dl"): HTMLDListElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_meta")
  def closest(selector: "meta"): HTMLMetaElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_cite")
  def closest(selector: "cite"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_feSpotLight")
  def closest(selector: "feSpotLight"): SVGFESpotLightElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_view")
  def closest(selector: "view"): SVGViewElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_article")
  def closest(selector: "article"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_tspan")
  def closest(selector: "tspan"): SVGTSpanElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_feMerge")
  def closest(selector: "feMerge"): SVGFEMergeElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_i")
  def closest(selector: "i"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_dir")
  def closest(selector: "dir"): HTMLDirectoryElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_radialGradient")
  def closest(selector: "radialGradient"): SVGRadialGradientElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_track")
  def closest(selector: "track"): HTMLTrackElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_dt")
  def closest(selector: "dt"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_script")
  def closest(selector: "script"): HTMLScriptElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_iframe")
  def closest(selector: "iframe"): HTMLIFrameElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_ruby")
  def closest(selector: "ruby"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_nav")
  def closest(selector: "nav"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_td")
  def closest(selector: "td"): HTMLTableDataCellElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_h5")
  def closest(selector: "h5"): HTMLHeadingElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_filter")
  def closest(selector: "filter"): SVGFilterElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_time")
  def closest(selector: "time"): HTMLTimeElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_map")
  def closest(selector: "map"): HTMLMapElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_feFuncR")
  def closest(selector: "feFuncR"): SVGFEFuncRElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_svg")
  def closest(selector: "svg"): SVGSVGElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_video")
  def closest(selector: "video"): HTMLVideoElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_small")
  def closest(selector: "small"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_label")
  def closest(selector: "label"): HTMLLabelElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_colgroup")
  def closest(selector: "colgroup"): HTMLTableColElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_feOffset")
  def closest(selector: "feOffset"): SVGFEOffsetElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_meter")
  def closest(selector: "meter"): HTMLMeterElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_kbd")
  def closest(selector: "kbd"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_feMergeNode")
  def closest(selector: "feMergeNode"): SVGFEMergeNodeElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_desc")
  def closest(selector: "desc"): SVGDescElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_text")
  def closest(selector: "text"): SVGTextElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_marker")
  def closest(selector: "marker"): SVGMarkerElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_clipPath")
  def closest(selector: "clipPath"): SVGClipPathElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_form")
  def closest(selector: "form"): HTMLFormElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_font")
  def closest(selector: "font"): HTMLFontElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_li")
  def closest(selector: "li"): HTMLLIElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_progress")
  def closest(selector: "progress"): HTMLProgressElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_feColorMatrix")
  def closest(selector: "feColorMatrix"): SVGFEColorMatrixElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_h1")
  def closest(selector: "h1"): HTMLHeadingElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_metadata")
  def closest(selector: "metadata"): SVGMetadataElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_h3")
  def closest(selector: "h3"): HTMLHeadingElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_param")
  def closest(selector: "param"): HTMLParamElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_bdi")
  def closest(selector: "bdi"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_foreignObject")
  def closest(selector: "foreignObject"): SVGForeignObjectElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_title")
  def closest(selector: "title"): HTMLTitleElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_details")
  def closest(selector: "details"): HTMLDetailsElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_caption")
  def closest(selector: "caption"): HTMLTableCaptionElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_feFuncG")
  def closest(selector: "feFuncG"): SVGFEFuncGElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_feSpecularLighting")
  def closest(selector: "feSpecularLighting"): SVGFESpecularLightingElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_span")
  def closest(selector: "span"): HTMLSpanElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_use")
  def closest(selector: "use"): SVGUseElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_feTurbulence")
  def closest(selector: "feTurbulence"): SVGFETurbulenceElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_feImage")
  def closest(selector: "feImage"): SVGFEImageElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_thead")
  def closest(selector: "thead"): HTMLTableSectionElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_div")
  def closest(selector: "div"): HTMLDivElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_frame")
  def closest(selector: "frame"): HTMLFrameElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_header")
  def closest(selector: "header"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_s")
  def closest(selector: "s"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_body")
  def closest(selector: "body"): HTMLBodyElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_audio")
  def closest(selector: "audio"): HTMLAudioElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_legend")
  def closest(selector: "legend"): HTMLLegendElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_tr")
  def closest(selector: "tr"): HTMLTableRowElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_address")
  def closest(selector: "address"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_strong")
  def closest(selector: "strong"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_mask")
  def closest(selector: "mask"): SVGMaskElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_tfoot")
  def closest(selector: "tfoot"): HTMLTableSectionElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_symbol")
  def closest(selector: "symbol"): SVGSymbolElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_image")
  def closest(selector: "image"): SVGImageElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_br")
  def closest(selector: "br"): HTMLBRElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_pattern")
  def closest(selector: "pattern"): SVGPatternElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_hr")
  def closest(selector: "hr"): HTMLHRElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_em")
  def closest(selector: "em"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_footer")
  def closest(selector: "footer"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_hgroup")
  def closest(selector: "hgroup"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("closest")
  @scala.annotation.targetName("closest_main")
  def closest(selector: "main"): org.scalajs.dom.HTMLElement | Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  /* standard dom */
  @JSName("closest")
  @scala.annotation.targetName("closest_a")
  def closest(selector: "a"): HTMLAnchorElement | Null = js.native
  /* standard dom */
  def closest[E /* <: org.scalajs.dom.Element */](selector: java.lang.String): E | Null = js.native
  
  /**
    * Returns element's first attribute whose qualified name is qualifiedName, and null if there is no such attribute otherwise.
    */
  /* standard dom */
  def getAttribute(qualifiedName: java.lang.String): java.lang.String | Null = js.native
  
  /**
    * Returns element's attribute whose namespace is namespace and local name is localName, and null if there is no such attribute otherwise.
    */
  /* standard dom */
  def getAttributeNS(namespace: java.lang.String, localName: java.lang.String): java.lang.String | Null = js.native
  def getAttributeNS(namespace: Null, localName: java.lang.String): java.lang.String | Null = js.native
  
  /**
    * Returns the qualified names of all element's attributes. Can contain duplicates.
    */
  /* standard dom */
  def getAttributeNames(): js.Array[java.lang.String] = js.native
  
  /* standard dom */
  def getAttributeNode(qualifiedName: java.lang.String): Attr | Null = js.native
  
  /* standard dom */
  def getAttributeNodeNS(namespace: java.lang.String, localName: java.lang.String): Attr | Null = js.native
  def getAttributeNodeNS(namespace: Null, localName: java.lang.String): Attr | Null = js.native
  
  /* standard dom */
  def getBoundingClientRect(): DOMRect = js.native
  
  /* standard dom */
  def getClientRects(): DOMRectList = js.native
  
  /**
    * Returns a HTMLCollection of the elements in the object on which the method was invoked (a document or an element) that have all the classes given by classNames. The classNames argument is interpreted as a space-separated list of classes.
    */
  /* standard dom */
  def getElementsByClassName(classNames: java.lang.String): HTMLCollectionOf[org.scalajs.dom.Element] = js.native
  
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_head")
  def getElementsByTagName(qualifiedName: "head"): HTMLCollectionOf[HTMLHeadElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_h4")
  def getElementsByTagName(qualifiedName: "h4"): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_col")
  def getElementsByTagName(qualifiedName: "col"): HTMLCollectionOf[HTMLTableColElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feFuncR")
  def getElementsByTagName(qualifiedName: "feFuncR"): HTMLCollectionOf[SVGFEFuncRElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_ins")
  def getElementsByTagName(qualifiedName: "ins"): HTMLCollectionOf[HTMLModElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_p")
  def getElementsByTagName(qualifiedName: "p"): HTMLCollectionOf[HTMLParagraphElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_i")
  def getElementsByTagName(qualifiedName: "i"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_output")
  def getElementsByTagName(qualifiedName: "output"): HTMLCollectionOf[HTMLOutputElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_td")
  def getElementsByTagName(qualifiedName: "td"): HTMLCollectionOf[HTMLTableDataCellElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_clipPath")
  def getElementsByTagName(qualifiedName: "clipPath"): HTMLCollectionOf[SVGClipPathElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_span")
  def getElementsByTagName(qualifiedName: "span"): HTMLCollectionOf[HTMLSpanElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_slot")
  def getElementsByTagName(qualifiedName: "slot"): HTMLCollectionOf[HTMLSlotElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_caption")
  def getElementsByTagName(qualifiedName: "caption"): HTMLCollectionOf[HTMLTableCaptionElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feDistantLight")
  def getElementsByTagName(qualifiedName: "feDistantLight"): HTMLCollectionOf[SVGFEDistantLightElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_switch")
  def getElementsByTagName(qualifiedName: "switch"): HTMLCollectionOf[SVGSwitchElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_hgroup")
  def getElementsByTagName(qualifiedName: "hgroup"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_th")
  def getElementsByTagName(qualifiedName: "th"): HTMLCollectionOf[HTMLTableHeaderCellElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_data")
  def getElementsByTagName(qualifiedName: "data"): HTMLCollectionOf[HTMLDataElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_dd")
  def getElementsByTagName(qualifiedName: "dd"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_table")
  def getElementsByTagName(qualifiedName: "table"): HTMLCollectionOf[HTMLTableElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_figcaption")
  def getElementsByTagName(qualifiedName: "figcaption"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_canvas")
  def getElementsByTagName(qualifiedName: "canvas"): HTMLCollectionOf[HTMLCanvasElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_audio")
  def getElementsByTagName(qualifiedName: "audio"): HTMLCollectionOf[HTMLAudioElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feFlood")
  def getElementsByTagName(qualifiedName: "feFlood"): HTMLCollectionOf[SVGFEFloodElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_h2")
  def getElementsByTagName(qualifiedName: "h2"): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_li")
  def getElementsByTagName(qualifiedName: "li"): HTMLCollectionOf[HTMLLIElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_wbr")
  def getElementsByTagName(qualifiedName: "wbr"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_object")
  def getElementsByTagName(qualifiedName: "object"): HTMLCollectionOf[HTMLObjectElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feComposite")
  def getElementsByTagName(qualifiedName: "feComposite"): HTMLCollectionOf[SVGFECompositeElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_marker")
  def getElementsByTagName(qualifiedName: "marker"): HTMLCollectionOf[SVGMarkerElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_dl")
  def getElementsByTagName(qualifiedName: "dl"): HTMLCollectionOf[HTMLDListElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_track")
  def getElementsByTagName(qualifiedName: "track"): HTMLCollectionOf[HTMLTrackElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_polyline")
  def getElementsByTagName(qualifiedName: "polyline"): HTMLCollectionOf[SVGPolylineElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feMorphology")
  def getElementsByTagName(qualifiedName: "feMorphology"): HTMLCollectionOf[SVGFEMorphologyElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_b")
  def getElementsByTagName(qualifiedName: "b"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feSpotLight")
  def getElementsByTagName(qualifiedName: "feSpotLight"): HTMLCollectionOf[SVGFESpotLightElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_progress")
  def getElementsByTagName(qualifiedName: "progress"): HTMLCollectionOf[HTMLProgressElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_code")
  def getElementsByTagName(qualifiedName: "code"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_h5")
  def getElementsByTagName(qualifiedName: "h5"): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_u")
  def getElementsByTagName(qualifiedName: "u"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feTurbulence")
  def getElementsByTagName(qualifiedName: "feTurbulence"): HTMLCollectionOf[SVGFETurbulenceElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_meter")
  def getElementsByTagName(qualifiedName: "meter"): HTMLCollectionOf[HTMLMeterElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_video")
  def getElementsByTagName(qualifiedName: "video"): HTMLCollectionOf[HTMLVideoElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feDiffuseLighting")
  def getElementsByTagName(qualifiedName: "feDiffuseLighting"): HTMLCollectionOf[SVGFEDiffuseLightingElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_bdo")
  def getElementsByTagName(qualifiedName: "bdo"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_address")
  def getElementsByTagName(qualifiedName: "address"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feColorMatrix")
  def getElementsByTagName(qualifiedName: "feColorMatrix"): HTMLCollectionOf[SVGFEColorMatrixElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_picture")
  def getElementsByTagName(qualifiedName: "picture"): HTMLCollectionOf[HTMLPictureElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_tfoot")
  def getElementsByTagName(qualifiedName: "tfoot"): HTMLCollectionOf[HTMLTableSectionElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_summary")
  def getElementsByTagName(qualifiedName: "summary"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_marquee")
  def getElementsByTagName(qualifiedName: "marquee"): HTMLCollectionOf[HTMLMarqueeElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_section")
  def getElementsByTagName(qualifiedName: "section"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_use")
  def getElementsByTagName(qualifiedName: "use"): HTMLCollectionOf[SVGUseElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_desc")
  def getElementsByTagName(qualifiedName: "desc"): HTMLCollectionOf[SVGDescElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_fePointLight")
  def getElementsByTagName(qualifiedName: "fePointLight"): HTMLCollectionOf[SVGFEPointLightElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_em")
  def getElementsByTagName(qualifiedName: "em"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feMergeNode")
  def getElementsByTagName(qualifiedName: "feMergeNode"): HTMLCollectionOf[SVGFEMergeNodeElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_map")
  def getElementsByTagName(qualifiedName: "map"): HTMLCollectionOf[HTMLMapElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_filter")
  def getElementsByTagName(qualifiedName: "filter"): HTMLCollectionOf[SVGFilterElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_tr")
  def getElementsByTagName(qualifiedName: "tr"): HTMLCollectionOf[HTMLTableRowElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_optgroup")
  def getElementsByTagName(qualifiedName: "optgroup"): HTMLCollectionOf[HTMLOptGroupElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_title")
  def getElementsByTagName(qualifiedName: "title"): HTMLCollectionOf[HTMLTitleElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feTile")
  def getElementsByTagName(qualifiedName: "feTile"): HTMLCollectionOf[SVGFETileElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feImage")
  def getElementsByTagName(qualifiedName: "feImage"): HTMLCollectionOf[SVGFEImageElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_text")
  def getElementsByTagName(qualifiedName: "text"): HTMLCollectionOf[SVGTextElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feDisplacementMap")
  def getElementsByTagName(qualifiedName: "feDisplacementMap"): HTMLCollectionOf[SVGFEDisplacementMapElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_h1")
  def getElementsByTagName(qualifiedName: "h1"): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_button")
  def getElementsByTagName(qualifiedName: "button"): HTMLCollectionOf[HTMLButtonElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_frame")
  def getElementsByTagName(qualifiedName: "frame"): HTMLCollectionOf[HTMLFrameElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_area")
  def getElementsByTagName(qualifiedName: "area"): HTMLCollectionOf[HTMLAreaElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_time")
  def getElementsByTagName(qualifiedName: "time"): HTMLCollectionOf[HTMLTimeElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_dfn")
  def getElementsByTagName(qualifiedName: "dfn"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_meta")
  def getElementsByTagName(qualifiedName: "meta"): HTMLCollectionOf[HTMLMetaElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_h6")
  def getElementsByTagName(qualifiedName: "h6"): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_circle")
  def getElementsByTagName(qualifiedName: "circle"): HTMLCollectionOf[SVGCircleElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_link")
  def getElementsByTagName(qualifiedName: "link"): HTMLCollectionOf[HTMLLinkElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_textarea")
  def getElementsByTagName(qualifiedName: "textarea"): HTMLCollectionOf[HTMLTextAreaElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feFuncB")
  def getElementsByTagName(qualifiedName: "feFuncB"): HTMLCollectionOf[SVGFEFuncBElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_abbr")
  def getElementsByTagName(qualifiedName: "abbr"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_datalist")
  def getElementsByTagName(qualifiedName: "datalist"): HTMLCollectionOf[HTMLDataListElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feComponentTransfer")
  def getElementsByTagName(qualifiedName: "feComponentTransfer"): HTMLCollectionOf[SVGFEComponentTransferElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_sup")
  def getElementsByTagName(qualifiedName: "sup"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feFuncA")
  def getElementsByTagName(qualifiedName: "feFuncA"): HTMLCollectionOf[SVGFEFuncAElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_ellipse")
  def getElementsByTagName(qualifiedName: "ellipse"): HTMLCollectionOf[SVGEllipseElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_menu")
  def getElementsByTagName(qualifiedName: "menu"): HTMLCollectionOf[HTMLMenuElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_figure")
  def getElementsByTagName(qualifiedName: "figure"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_dir")
  def getElementsByTagName(qualifiedName: "dir"): HTMLCollectionOf[HTMLDirectoryElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_stop")
  def getElementsByTagName(qualifiedName: "stop"): HTMLCollectionOf[SVGStopElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_input")
  def getElementsByTagName(qualifiedName: "input"): HTMLCollectionOf[HTMLInputElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_mask")
  def getElementsByTagName(qualifiedName: "mask"): HTMLCollectionOf[SVGMaskElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_source")
  def getElementsByTagName(qualifiedName: "source"): HTMLCollectionOf[HTMLSourceElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_embed")
  def getElementsByTagName(qualifiedName: "embed"): HTMLCollectionOf[HTMLEmbedElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_ruby")
  def getElementsByTagName(qualifiedName: "ruby"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  /* standard dom */
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_a")
  def getElementsByTagName(qualifiedName: "a"): HTMLCollectionOf[HTMLAnchorElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_tspan")
  def getElementsByTagName(qualifiedName: "tspan"): HTMLCollectionOf[SVGTSpanElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_option")
  def getElementsByTagName(qualifiedName: "option"): HTMLCollectionOf[HTMLOptionElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_blockquote")
  def getElementsByTagName(qualifiedName: "blockquote"): HTMLCollectionOf[HTMLQuoteElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_view")
  def getElementsByTagName(qualifiedName: "view"): HTMLCollectionOf[SVGViewElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_cite")
  def getElementsByTagName(qualifiedName: "cite"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feFuncG")
  def getElementsByTagName(qualifiedName: "feFuncG"): HTMLCollectionOf[SVGFEFuncGElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_del")
  def getElementsByTagName(qualifiedName: "del"): HTMLCollectionOf[HTMLModElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_rect")
  def getElementsByTagName(qualifiedName: "rect"): HTMLCollectionOf[SVGRectElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_style")
  def getElementsByTagName(qualifiedName: "style"): HTMLCollectionOf[HTMLStyleElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_q")
  def getElementsByTagName(qualifiedName: "q"): HTMLCollectionOf[HTMLQuoteElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_div")
  def getElementsByTagName(qualifiedName: "div"): HTMLCollectionOf[HTMLDivElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_fieldset")
  def getElementsByTagName(qualifiedName: "fieldset"): HTMLCollectionOf[HTMLFieldSetElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_header")
  def getElementsByTagName(qualifiedName: "header"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_line")
  def getElementsByTagName(qualifiedName: "line"): HTMLCollectionOf[SVGLineElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_h3")
  def getElementsByTagName(qualifiedName: "h3"): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_main")
  def getElementsByTagName(qualifiedName: "main"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_g")
  def getElementsByTagName(qualifiedName: "g"): HTMLCollectionOf[SVGGElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_path")
  def getElementsByTagName(qualifiedName: "path"): HTMLCollectionOf[SVGPathElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_param")
  def getElementsByTagName(qualifiedName: "param"): HTMLCollectionOf[HTMLParamElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_small")
  def getElementsByTagName(qualifiedName: "small"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_metadata")
  def getElementsByTagName(qualifiedName: "metadata"): HTMLCollectionOf[SVGMetadataElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_samp")
  def getElementsByTagName(qualifiedName: "samp"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_aside")
  def getElementsByTagName(qualifiedName: "aside"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_iframe")
  def getElementsByTagName(qualifiedName: "iframe"): HTMLCollectionOf[HTMLIFrameElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_body")
  def getElementsByTagName(qualifiedName: "body"): HTMLCollectionOf[HTMLBodyElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_kbd")
  def getElementsByTagName(qualifiedName: "kbd"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_details")
  def getElementsByTagName(qualifiedName: "details"): HTMLCollectionOf[HTMLDetailsElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_script")
  def getElementsByTagName(qualifiedName: "script"): HTMLCollectionOf[HTMLScriptElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_var")
  def getElementsByTagName(qualifiedName: "var"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_svg")
  def getElementsByTagName(qualifiedName: "svg"): HTMLCollectionOf[SVGSVGElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_rp")
  def getElementsByTagName(qualifiedName: "rp"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_defs")
  def getElementsByTagName(qualifiedName: "defs"): HTMLCollectionOf[SVGDefsElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feConvolveMatrix")
  def getElementsByTagName(qualifiedName: "feConvolveMatrix"): HTMLCollectionOf[SVGFEConvolveMatrixElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_sub")
  def getElementsByTagName(qualifiedName: "sub"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_label")
  def getElementsByTagName(qualifiedName: "label"): HTMLCollectionOf[HTMLLabelElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_template")
  def getElementsByTagName(qualifiedName: "template"): HTMLCollectionOf[HTMLTemplateElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_ol")
  def getElementsByTagName(qualifiedName: "ol"): HTMLCollectionOf[HTMLOListElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feGaussianBlur")
  def getElementsByTagName(qualifiedName: "feGaussianBlur"): HTMLCollectionOf[SVGFEGaussianBlurElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feSpecularLighting")
  def getElementsByTagName(qualifiedName: "feSpecularLighting"): HTMLCollectionOf[SVGFESpecularLightingElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_rt")
  def getElementsByTagName(qualifiedName: "rt"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_footer")
  def getElementsByTagName(qualifiedName: "footer"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_linearGradient")
  def getElementsByTagName(qualifiedName: "linearGradient"): HTMLCollectionOf[SVGLinearGradientElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_nav")
  def getElementsByTagName(qualifiedName: "nav"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_pre")
  def getElementsByTagName(qualifiedName: "pre"): HTMLCollectionOf[HTMLPreElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_image")
  def getElementsByTagName(qualifiedName: "image"): HTMLCollectionOf[SVGImageElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_textPath")
  def getElementsByTagName(qualifiedName: "textPath"): HTMLCollectionOf[SVGTextPathElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_thead")
  def getElementsByTagName(qualifiedName: "thead"): HTMLCollectionOf[HTMLTableSectionElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feMerge")
  def getElementsByTagName(qualifiedName: "feMerge"): HTMLCollectionOf[SVGFEMergeElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feOffset")
  def getElementsByTagName(qualifiedName: "feOffset"): HTMLCollectionOf[SVGFEOffsetElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_applet")
  def getElementsByTagName(qualifiedName: "applet"): HTMLCollectionOf[HTMLAppletElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_dt")
  def getElementsByTagName(qualifiedName: "dt"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_ul")
  def getElementsByTagName(qualifiedName: "ul"): HTMLCollectionOf[HTMLUListElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_form")
  def getElementsByTagName(qualifiedName: "form"): HTMLCollectionOf[HTMLFormElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_radialGradient")
  def getElementsByTagName(qualifiedName: "radialGradient"): HTMLCollectionOf[SVGRadialGradientElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_select")
  def getElementsByTagName(qualifiedName: "select"): HTMLCollectionOf[HTMLSelectElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_bdi")
  def getElementsByTagName(qualifiedName: "bdi"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_s")
  def getElementsByTagName(qualifiedName: "s"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_foreignObject")
  def getElementsByTagName(qualifiedName: "foreignObject"): HTMLCollectionOf[SVGForeignObjectElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_symbol")
  def getElementsByTagName(qualifiedName: "symbol"): HTMLCollectionOf[SVGSymbolElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_mark")
  def getElementsByTagName(qualifiedName: "mark"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_colgroup")
  def getElementsByTagName(qualifiedName: "colgroup"): HTMLCollectionOf[HTMLTableColElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_html")
  def getElementsByTagName(qualifiedName: "html"): HTMLCollectionOf[HTMLHtmlElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_strong")
  def getElementsByTagName(qualifiedName: "strong"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_font")
  def getElementsByTagName(qualifiedName: "font"): HTMLCollectionOf[HTMLFontElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feBlend")
  def getElementsByTagName(qualifiedName: "feBlend"): HTMLCollectionOf[SVGFEBlendElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_pattern")
  def getElementsByTagName(qualifiedName: "pattern"): HTMLCollectionOf[SVGPatternElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_tbody")
  def getElementsByTagName(qualifiedName: "tbody"): HTMLCollectionOf[HTMLTableSectionElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_br")
  def getElementsByTagName(qualifiedName: "br"): HTMLCollectionOf[HTMLBRElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_article")
  def getElementsByTagName(qualifiedName: "article"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_base")
  def getElementsByTagName(qualifiedName: "base"): HTMLCollectionOf[HTMLBaseElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_noscript")
  def getElementsByTagName(qualifiedName: "noscript"): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_frameset")
  def getElementsByTagName(qualifiedName: "frameset"): HTMLCollectionOf[HTMLFrameSetElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_polygon")
  def getElementsByTagName(qualifiedName: "polygon"): HTMLCollectionOf[SVGPolygonElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_hr")
  def getElementsByTagName(qualifiedName: "hr"): HTMLCollectionOf[HTMLHRElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_img")
  def getElementsByTagName(qualifiedName: "img"): HTMLCollectionOf[HTMLImageElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_legend")
  def getElementsByTagName(qualifiedName: "legend"): HTMLCollectionOf[HTMLLegendElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_dialog")
  def getElementsByTagName(qualifiedName: "dialog"): HTMLCollectionOf[HTMLDialogElement] = js.native
  /* standard dom */
  def getElementsByTagName(qualifiedName: java.lang.String): HTMLCollectionOf[org.scalajs.dom.Element] = js.native
  
  /* standard dom */
  @JSName("getElementsByTagNameNS")
  @scala.annotation.targetName("getElementsByTagNameNS_httpwwww3org1999xhtml")
  def getElementsByTagNameNS(namespaceURI: "http://www.w3.org/1999/xhtml", localName: java.lang.String): HTMLCollectionOf[org.scalajs.dom.HTMLElement] = js.native
  /* standard dom */
  @JSName("getElementsByTagNameNS")
  @scala.annotation.targetName("getElementsByTagNameNS_httpwwww3org2000svg")
  def getElementsByTagNameNS(namespaceURI: "http://www.w3.org/2000/svg", localName: java.lang.String): HTMLCollectionOf[org.scalajs.dom.SVGElement] = js.native
  /* standard dom */
  def getElementsByTagNameNS(namespaceURI: java.lang.String, localName: java.lang.String): HTMLCollectionOf[org.scalajs.dom.Element] = js.native
  
  /**
    * Returns true if element has an attribute whose qualified name is qualifiedName, and false otherwise.
    */
  /* standard dom */
  def hasAttribute(qualifiedName: java.lang.String): Boolean = js.native
  
  /**
    * Returns true if element has an attribute whose namespace is namespace and local name is localName.
    */
  /* standard dom */
  def hasAttributeNS(namespace: java.lang.String, localName: java.lang.String): Boolean = js.native
  def hasAttributeNS(namespace: Null, localName: java.lang.String): Boolean = js.native
  
  /**
    * Returns true if element has attributes, and false otherwise.
    */
  /* standard dom */
  def hasAttributes(): Boolean = js.native
  
  /* standard dom */
  def hasPointerCapture(pointerId: Double): Boolean = js.native
  
  /**
    * Returns the value of element's id content attribute. Can be set to change it.
    */
  /* standard dom */
  var id: java.lang.String = js.native
  
  /* standard dom */
  def insertAdjacentElement(position: InsertPosition, insertedElement: org.scalajs.dom.Element): org.scalajs.dom.Element | Null = js.native
  
  /* standard dom */
  def insertAdjacentHTML(where: InsertPosition, html: java.lang.String): Unit = js.native
  
  /* standard dom */
  def insertAdjacentText(where: InsertPosition, text: java.lang.String): Unit = js.native
  
  /**
    * Returns the local name.
    */
  /* standard dom */
  val localName: java.lang.String = js.native
  
  /**
    * Returns true if matching selectors against element's root yields element, and false otherwise.
    */
  /* standard dom */
  def matches(selectors: java.lang.String): Boolean = js.native
  
  /* standard dom */
  def msGetRegionContent(): Any = js.native
  
  /* standard dom */
  var onfullscreenchange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard dom */
  var onfullscreenerror: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard dom */
  var outerHTML: java.lang.String = js.native
  
  /* standard dom */
  @JSName("ownerDocument")
  val ownerDocument_Element: Document = js.native
  
  /**
    * Returns the namespace prefix.
    */
  /* standard dom */
  val prefix: java.lang.String | Null = js.native
  
  /* standard dom */
  def releasePointerCapture(pointerId: Double): Unit = js.native
  
  /**
    * Removes element's first attribute whose qualified name is qualifiedName.
    */
  /* standard dom */
  def removeAttribute(qualifiedName: java.lang.String): Unit = js.native
  
  /**
    * Removes element's attribute whose namespace is namespace and local name is localName.
    */
  /* standard dom */
  def removeAttributeNS(namespace: java.lang.String, localName: java.lang.String): Unit = js.native
  def removeAttributeNS(namespace: Null, localName: java.lang.String): Unit = js.native
  
  /* standard dom */
  def removeAttributeNode(attr: Attr): Attr = js.native
  
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_fullscreenerror")
  def removeEventListener(
    `type`: "fullscreenerror",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  /* standard dom */
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_fullscreenchange")
  def removeEventListener(
    `type`: "fullscreenchange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_fullscreenerror")
  def removeEventListener(
    `type`: "fullscreenerror",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_fullscreenchange")
  def removeEventListener(
    `type`: "fullscreenchange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_fullscreenchange")
  def removeEventListener(
    `type`: "fullscreenchange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_fullscreenerror")
  def removeEventListener(
    `type`: "fullscreenerror",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: Boolean
  ): Unit = js.native
  
  /**
    * Displays element fullscreen and resolves promise when done.
    *
    * When supplied, options's navigationUI member indicates whether showing navigation UI while in fullscreen is preferred or not. If set to "show", navigation simplicity is preferred over screen space, and if set to "hide", more screen space is preferred. User agents are always free to honor user preference over the application's. The default value "auto" indicates no application preference.
    */
  /* standard dom */
  def requestFullscreen(): js.Promise[Unit] = js.native
  def requestFullscreen(options: FullscreenOptions): js.Promise[Unit] = js.native
  
  /* standard dom */
  def requestPointerLock(): Unit = js.native
  
  /* standard dom */
  def scroll(): Unit = js.native
  def scroll(options: ScrollToOptions): Unit = js.native
  /* standard dom */
  def scroll(x: Double, y: Double): Unit = js.native
  
  /* standard dom */
  def scrollBy(): Unit = js.native
  def scrollBy(options: ScrollToOptions): Unit = js.native
  /* standard dom */
  def scrollBy(x: Double, y: Double): Unit = js.native
  
  /* standard dom */
  val scrollHeight: Double = js.native
  
  /* standard dom */
  def scrollIntoView(): Unit = js.native
  def scrollIntoView(arg: ScrollIntoViewOptions): Unit = js.native
  def scrollIntoView(arg: Boolean): Unit = js.native
  
  /* standard dom */
  var scrollLeft: Double = js.native
  
  /* standard dom */
  def scrollTo(): Unit = js.native
  def scrollTo(options: ScrollToOptions): Unit = js.native
  /* standard dom */
  def scrollTo(x: Double, y: Double): Unit = js.native
  
  /* standard dom */
  var scrollTop: Double = js.native
  
  /* standard dom */
  val scrollWidth: Double = js.native
  
  /**
    * Sets the value of element's first attribute whose qualified name is qualifiedName to value.
    */
  /* standard dom */
  def setAttribute(qualifiedName: java.lang.String, value: java.lang.String): Unit = js.native
  
  /**
    * Sets the value of element's attribute whose namespace is namespace and local name is localName to value.
    */
  /* standard dom */
  def setAttributeNS(namespace: java.lang.String, qualifiedName: java.lang.String, value: java.lang.String): Unit = js.native
  def setAttributeNS(namespace: Null, qualifiedName: java.lang.String, value: java.lang.String): Unit = js.native
  
  /* standard dom */
  def setAttributeNode(attr: Attr): Attr | Null = js.native
  
  /* standard dom */
  def setAttributeNodeNS(attr: Attr): Attr | Null = js.native
  
  /* standard dom */
  def setPointerCapture(pointerId: Double): Unit = js.native
  
  /**
    * Returns element's shadow root, if any, and if shadow root's mode is "open", and null otherwise.
    */
  /* standard dom */
  val shadowRoot: ShadowRoot | Null = js.native
  
  /**
    * Returns the value of element's slot content attribute. Can be set to change it.
    */
  /* standard dom */
  var slot: java.lang.String = js.native
  
  /**
    * Returns the HTML-uppercased qualified name.
    */
  /* standard dom */
  val tagName: java.lang.String = js.native
  
  /**
    * If force is not given, "toggles" qualifiedName, removing it if it is present and adding it if it is not present. If force is true, adds qualifiedName. If force is false, removes qualifiedName.
    *
    * Returns true if qualifiedName is now present, and false otherwise.
    */
  /* standard dom */
  def toggleAttribute(qualifiedName: java.lang.String): Boolean = js.native
  def toggleAttribute(qualifiedName: java.lang.String, force: Boolean): Boolean = js.native
  
  /* standard dom */
  def webkitMatchesSelector(selectors: java.lang.String): Boolean = js.native
}
