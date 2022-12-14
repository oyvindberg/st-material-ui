package com.olvind.mui.std

import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLAreaElement
import org.scalajs.dom.HTMLAudioElement
import org.scalajs.dom.HTMLBRElement
import org.scalajs.dom.HTMLBaseElement
import org.scalajs.dom.HTMLBodyElement
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLCollection
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
import org.scalajs.dom.NodeList
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

@js.native
trait ParentNode extends StObject {
  
  /**
    * Inserts nodes after the last child of node, while replacing strings in nodes with equivalent Text nodes.
    *
    * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
    */
  /* standard dom */
  def append(nodes: (org.scalajs.dom.Node | java.lang.String)*): Unit = js.native
  
  /* standard dom */
  val childElementCount: Double = js.native
  
  /**
    * Returns the child elements.
    */
  /* standard dom */
  val children: HTMLCollection[Any] = js.native
  
  /**
    * Returns the first child that is an element, and null otherwise.
    */
  /* standard dom */
  val firstElementChild: org.scalajs.dom.Element | Null = js.native
  
  /**
    * Returns the last child that is an element, and null otherwise.
    */
  /* standard dom */
  val lastElementChild: org.scalajs.dom.Element | Null = js.native
  
  /**
    * Inserts nodes before the first child of node, while replacing strings in nodes with equivalent Text nodes.
    *
    * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
    */
  /* standard dom */
  def prepend(nodes: (org.scalajs.dom.Node | java.lang.String)*): Unit = js.native
  
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feImage")
  def querySelector(selectors: "feImage"): SVGFEImageElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_rect")
  def querySelector(selectors: "rect"): SVGRectElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_del")
  def querySelector(selectors: "del"): HTMLModElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_h5")
  def querySelector(selectors: "h5"): HTMLHeadingElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feColorMatrix")
  def querySelector(selectors: "feColorMatrix"): SVGFEColorMatrixElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_applet")
  def querySelector(selectors: "applet"): HTMLAppletElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_track")
  def querySelector(selectors: "track"): HTMLTrackElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_ol")
  def querySelector(selectors: "ol"): HTMLOListElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_em")
  def querySelector(selectors: "em"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_g")
  def querySelector(selectors: "g"): SVGGElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_h4")
  def querySelector(selectors: "h4"): HTMLHeadingElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feSpotLight")
  def querySelector(selectors: "feSpotLight"): SVGFESpotLightElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_td")
  def querySelector(selectors: "td"): HTMLTableDataCellElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_br")
  def querySelector(selectors: "br"): HTMLBRElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_thead")
  def querySelector(selectors: "thead"): HTMLTableSectionElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_figure")
  def querySelector(selectors: "figure"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_div")
  def querySelector(selectors: "div"): HTMLDivElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_sub")
  def querySelector(selectors: "sub"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_abbr")
  def querySelector(selectors: "abbr"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_blockquote")
  def querySelector(selectors: "blockquote"): HTMLQuoteElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feDistantLight")
  def querySelector(selectors: "feDistantLight"): SVGFEDistantLightElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_footer")
  def querySelector(selectors: "footer"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feFuncR")
  def querySelector(selectors: "feFuncR"): SVGFEFuncRElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_body")
  def querySelector(selectors: "body"): HTMLBodyElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_input")
  def querySelector(selectors: "input"): HTMLInputElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feComposite")
  def querySelector(selectors: "feComposite"): SVGFECompositeElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_textarea")
  def querySelector(selectors: "textarea"): HTMLTextAreaElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_form")
  def querySelector(selectors: "form"): HTMLFormElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_s")
  def querySelector(selectors: "s"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_select")
  def querySelector(selectors: "select"): HTMLSelectElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_script")
  def querySelector(selectors: "script"): HTMLScriptElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feFuncA")
  def querySelector(selectors: "feFuncA"): SVGFEFuncAElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_col")
  def querySelector(selectors: "col"): HTMLTableColElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_dir")
  def querySelector(selectors: "dir"): HTMLDirectoryElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_link")
  def querySelector(selectors: "link"): HTMLLinkElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feTile")
  def querySelector(selectors: "feTile"): SVGFETileElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_picture")
  def querySelector(selectors: "picture"): HTMLPictureElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_foreignObject")
  def querySelector(selectors: "foreignObject"): SVGForeignObjectElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_font")
  def querySelector(selectors: "font"): HTMLFontElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_bdo")
  def querySelector(selectors: "bdo"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_filter")
  def querySelector(selectors: "filter"): SVGFilterElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_svg")
  def querySelector(selectors: "svg"): SVGSVGElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_caption")
  def querySelector(selectors: "caption"): HTMLTableCaptionElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_ruby")
  def querySelector(selectors: "ruby"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feBlend")
  def querySelector(selectors: "feBlend"): SVGFEBlendElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_tr")
  def querySelector(selectors: "tr"): HTMLTableRowElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_h6")
  def querySelector(selectors: "h6"): HTMLHeadingElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_use")
  def querySelector(selectors: "use"): SVGUseElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_tfoot")
  def querySelector(selectors: "tfoot"): HTMLTableSectionElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_output")
  def querySelector(selectors: "output"): HTMLOutputElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_dialog")
  def querySelector(selectors: "dialog"): HTMLDialogElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_audio")
  def querySelector(selectors: "audio"): HTMLAudioElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_colgroup")
  def querySelector(selectors: "colgroup"): HTMLTableColElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_option")
  def querySelector(selectors: "option"): HTMLOptionElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_path")
  def querySelector(selectors: "path"): SVGPathElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feMorphology")
  def querySelector(selectors: "feMorphology"): SVGFEMorphologyElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feOffset")
  def querySelector(selectors: "feOffset"): SVGFEOffsetElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_img")
  def querySelector(selectors: "img"): HTMLImageElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_strong")
  def querySelector(selectors: "strong"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_video")
  def querySelector(selectors: "video"): HTMLVideoElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_menu")
  def querySelector(selectors: "menu"): HTMLMenuElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_marquee")
  def querySelector(selectors: "marquee"): HTMLMarqueeElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_rt")
  def querySelector(selectors: "rt"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feMerge")
  def querySelector(selectors: "feMerge"): SVGFEMergeElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_main")
  def querySelector(selectors: "main"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_sup")
  def querySelector(selectors: "sup"): org.scalajs.dom.HTMLElement | Null = js.native
  /**
    * Returns the first element that is a descendant of node that matches selectors.
    */
  /* standard dom */
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_a")
  def querySelector(selectors: "a"): HTMLAnchorElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_fieldset")
  def querySelector(selectors: "fieldset"): HTMLFieldSetElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_image")
  def querySelector(selectors: "image"): SVGImageElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_switch")
  def querySelector(selectors: "switch"): SVGSwitchElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_wbr")
  def querySelector(selectors: "wbr"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_p")
  def querySelector(selectors: "p"): HTMLParagraphElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_style")
  def querySelector(selectors: "style"): HTMLStyleElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_h2")
  def querySelector(selectors: "h2"): HTMLHeadingElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_pattern")
  def querySelector(selectors: "pattern"): SVGPatternElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_marker")
  def querySelector(selectors: "marker"): SVGMarkerElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_mark")
  def querySelector(selectors: "mark"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_linearGradient")
  def querySelector(selectors: "linearGradient"): SVGLinearGradientElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feFlood")
  def querySelector(selectors: "feFlood"): SVGFEFloodElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_th")
  def querySelector(selectors: "th"): HTMLTableHeaderCellElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feGaussianBlur")
  def querySelector(selectors: "feGaussianBlur"): SVGFEGaussianBlurElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_desc")
  def querySelector(selectors: "desc"): SVGDescElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_param")
  def querySelector(selectors: "param"): HTMLParamElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_pre")
  def querySelector(selectors: "pre"): HTMLPreElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_meta")
  def querySelector(selectors: "meta"): HTMLMetaElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_li")
  def querySelector(selectors: "li"): HTMLLIElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_span")
  def querySelector(selectors: "span"): HTMLSpanElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_polyline")
  def querySelector(selectors: "polyline"): SVGPolylineElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_head")
  def querySelector(selectors: "head"): HTMLHeadElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_frame")
  def querySelector(selectors: "frame"): HTMLFrameElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_address")
  def querySelector(selectors: "address"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_dd")
  def querySelector(selectors: "dd"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_time")
  def querySelector(selectors: "time"): HTMLTimeElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_noscript")
  def querySelector(selectors: "noscript"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_rp")
  def querySelector(selectors: "rp"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_area")
  def querySelector(selectors: "area"): HTMLAreaElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_ul")
  def querySelector(selectors: "ul"): HTMLUListElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_mask")
  def querySelector(selectors: "mask"): SVGMaskElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_h1")
  def querySelector(selectors: "h1"): HTMLHeadingElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_details")
  def querySelector(selectors: "details"): HTMLDetailsElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_hr")
  def querySelector(selectors: "hr"): HTMLHRElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_polygon")
  def querySelector(selectors: "polygon"): SVGPolygonElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_slot")
  def querySelector(selectors: "slot"): HTMLSlotElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_ins")
  def querySelector(selectors: "ins"): HTMLModElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_cite")
  def querySelector(selectors: "cite"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_tbody")
  def querySelector(selectors: "tbody"): HTMLTableSectionElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_nav")
  def querySelector(selectors: "nav"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_html")
  def querySelector(selectors: "html"): HTMLHtmlElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_textPath")
  def querySelector(selectors: "textPath"): SVGTextPathElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_frameset")
  def querySelector(selectors: "frameset"): HTMLFrameSetElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_table")
  def querySelector(selectors: "table"): HTMLTableElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_circle")
  def querySelector(selectors: "circle"): SVGCircleElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_iframe")
  def querySelector(selectors: "iframe"): HTMLIFrameElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_article")
  def querySelector(selectors: "article"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_stop")
  def querySelector(selectors: "stop"): SVGStopElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_b")
  def querySelector(selectors: "b"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_label")
  def querySelector(selectors: "label"): HTMLLabelElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_section")
  def querySelector(selectors: "section"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_template")
  def querySelector(selectors: "template"): HTMLTemplateElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_dl")
  def querySelector(selectors: "dl"): HTMLDListElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_var")
  def querySelector(selectors: "var"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_h3")
  def querySelector(selectors: "h3"): HTMLHeadingElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feConvolveMatrix")
  def querySelector(selectors: "feConvolveMatrix"): SVGFEConvolveMatrixElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_view")
  def querySelector(selectors: "view"): SVGViewElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_ellipse")
  def querySelector(selectors: "ellipse"): SVGEllipseElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_data")
  def querySelector(selectors: "data"): HTMLDataElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_kbd")
  def querySelector(selectors: "kbd"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feMergeNode")
  def querySelector(selectors: "feMergeNode"): SVGFEMergeNodeElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_fePointLight")
  def querySelector(selectors: "fePointLight"): SVGFEPointLightElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_embed")
  def querySelector(selectors: "embed"): HTMLEmbedElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_dfn")
  def querySelector(selectors: "dfn"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_clipPath")
  def querySelector(selectors: "clipPath"): SVGClipPathElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_symbol")
  def querySelector(selectors: "symbol"): SVGSymbolElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_bdi")
  def querySelector(selectors: "bdi"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_progress")
  def querySelector(selectors: "progress"): HTMLProgressElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feComponentTransfer")
  def querySelector(selectors: "feComponentTransfer"): SVGFEComponentTransferElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_i")
  def querySelector(selectors: "i"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_tspan")
  def querySelector(selectors: "tspan"): SVGTSpanElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_title")
  def querySelector(selectors: "title"): HTMLTitleElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_source")
  def querySelector(selectors: "source"): HTMLSourceElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_defs")
  def querySelector(selectors: "defs"): SVGDefsElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feSpecularLighting")
  def querySelector(selectors: "feSpecularLighting"): SVGFESpecularLightingElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_legend")
  def querySelector(selectors: "legend"): HTMLLegendElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feFuncG")
  def querySelector(selectors: "feFuncG"): SVGFEFuncGElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feDisplacementMap")
  def querySelector(selectors: "feDisplacementMap"): SVGFEDisplacementMapElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_datalist")
  def querySelector(selectors: "datalist"): HTMLDataListElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_u")
  def querySelector(selectors: "u"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_text")
  def querySelector(selectors: "text"): SVGTextElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feTurbulence")
  def querySelector(selectors: "feTurbulence"): SVGFETurbulenceElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_radialGradient")
  def querySelector(selectors: "radialGradient"): SVGRadialGradientElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_aside")
  def querySelector(selectors: "aside"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_optgroup")
  def querySelector(selectors: "optgroup"): HTMLOptGroupElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_meter")
  def querySelector(selectors: "meter"): HTMLMeterElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_summary")
  def querySelector(selectors: "summary"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_map")
  def querySelector(selectors: "map"): HTMLMapElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feDiffuseLighting")
  def querySelector(selectors: "feDiffuseLighting"): SVGFEDiffuseLightingElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_dt")
  def querySelector(selectors: "dt"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_object")
  def querySelector(selectors: "object"): HTMLObjectElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_figcaption")
  def querySelector(selectors: "figcaption"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_samp")
  def querySelector(selectors: "samp"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_small")
  def querySelector(selectors: "small"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_button")
  def querySelector(selectors: "button"): HTMLButtonElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_metadata")
  def querySelector(selectors: "metadata"): SVGMetadataElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_line")
  def querySelector(selectors: "line"): SVGLineElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feFuncB")
  def querySelector(selectors: "feFuncB"): SVGFEFuncBElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_canvas")
  def querySelector(selectors: "canvas"): HTMLCanvasElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_code")
  def querySelector(selectors: "code"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_base")
  def querySelector(selectors: "base"): HTMLBaseElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_q")
  def querySelector(selectors: "q"): HTMLQuoteElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_hgroup")
  def querySelector(selectors: "hgroup"): org.scalajs.dom.HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_header")
  def querySelector(selectors: "header"): org.scalajs.dom.HTMLElement | Null = js.native
  /* standard dom */
  def querySelector[E /* <: org.scalajs.dom.Element */](selectors: java.lang.String): E | Null = js.native
  
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_embed")
  def querySelectorAll(selectors: "embed"): NodeList[HTMLEmbedElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_colgroup")
  def querySelectorAll(selectors: "colgroup"): NodeList[HTMLTableColElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_desc")
  def querySelectorAll(selectors: "desc"): NodeList[SVGDescElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_area")
  def querySelectorAll(selectors: "area"): NodeList[HTMLAreaElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_form")
  def querySelectorAll(selectors: "form"): NodeList[HTMLFormElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_figcaption")
  def querySelectorAll(selectors: "figcaption"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_ins")
  def querySelectorAll(selectors: "ins"): NodeList[HTMLModElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_wbr")
  def querySelectorAll(selectors: "wbr"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_frame")
  def querySelectorAll(selectors: "frame"): NodeList[HTMLFrameElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_time")
  def querySelectorAll(selectors: "time"): NodeList[HTMLTimeElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_h1")
  def querySelectorAll(selectors: "h1"): NodeList[HTMLHeadingElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_img")
  def querySelectorAll(selectors: "img"): NodeList[HTMLImageElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_path")
  def querySelectorAll(selectors: "path"): NodeList[SVGPathElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_header")
  def querySelectorAll(selectors: "header"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_legend")
  def querySelectorAll(selectors: "legend"): NodeList[HTMLLegendElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_defs")
  def querySelectorAll(selectors: "defs"): NodeList[SVGDefsElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_rect")
  def querySelectorAll(selectors: "rect"): NodeList[SVGRectElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_polygon")
  def querySelectorAll(selectors: "polygon"): NodeList[SVGPolygonElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_link")
  def querySelectorAll(selectors: "link"): NodeList[HTMLLinkElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_ellipse")
  def querySelectorAll(selectors: "ellipse"): NodeList[SVGEllipseElement & org.scalajs.dom.Node] = js.native
  /**
    * Returns all element descendants of node that match selectors.
    */
  /* standard dom */
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_a")
  def querySelectorAll(selectors: "a"): NodeList[HTMLAnchorElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_map")
  def querySelectorAll(selectors: "map"): NodeList[HTMLMapElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feMerge")
  def querySelectorAll(selectors: "feMerge"): NodeList[SVGFEMergeElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_filter")
  def querySelectorAll(selectors: "filter"): NodeList[SVGFilterElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_template")
  def querySelectorAll(selectors: "template"): NodeList[HTMLTemplateElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_u")
  def querySelectorAll(selectors: "u"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_div")
  def querySelectorAll(selectors: "div"): NodeList[HTMLDivElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_video")
  def querySelectorAll(selectors: "video"): NodeList[HTMLVideoElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_polyline")
  def querySelectorAll(selectors: "polyline"): NodeList[SVGPolylineElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_em")
  def querySelectorAll(selectors: "em"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feImage")
  def querySelectorAll(selectors: "feImage"): NodeList[SVGFEImageElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_text")
  def querySelectorAll(selectors: "text"): NodeList[SVGTextElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feFuncG")
  def querySelectorAll(selectors: "feFuncG"): NodeList[SVGFEFuncGElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_br")
  def querySelectorAll(selectors: "br"): NodeList[HTMLBRElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_html")
  def querySelectorAll(selectors: "html"): NodeList[HTMLHtmlElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feFlood")
  def querySelectorAll(selectors: "feFlood"): NodeList[SVGFEFloodElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_th")
  def querySelectorAll(selectors: "th"): NodeList[HTMLTableHeaderCellElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_h2")
  def querySelectorAll(selectors: "h2"): NodeList[HTMLHeadingElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_pattern")
  def querySelectorAll(selectors: "pattern"): NodeList[SVGPatternElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_tspan")
  def querySelectorAll(selectors: "tspan"): NodeList[SVGTSpanElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feTurbulence")
  def querySelectorAll(selectors: "feTurbulence"): NodeList[SVGFETurbulenceElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_g")
  def querySelectorAll(selectors: "g"): NodeList[SVGGElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feDiffuseLighting")
  def querySelectorAll(selectors: "feDiffuseLighting"): NodeList[SVGFEDiffuseLightingElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_radialGradient")
  def querySelectorAll(selectors: "radialGradient"): NodeList[SVGRadialGradientElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_progress")
  def querySelectorAll(selectors: "progress"): NodeList[HTMLProgressElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_circle")
  def querySelectorAll(selectors: "circle"): NodeList[SVGCircleElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_marquee")
  def querySelectorAll(selectors: "marquee"): NodeList[HTMLMarqueeElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_details")
  def querySelectorAll(selectors: "details"): NodeList[HTMLDetailsElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_noscript")
  def querySelectorAll(selectors: "noscript"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_applet")
  def querySelectorAll(selectors: "applet"): NodeList[HTMLAppletElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_dir")
  def querySelectorAll(selectors: "dir"): NodeList[HTMLDirectoryElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_address")
  def querySelectorAll(selectors: "address"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_view")
  def querySelectorAll(selectors: "view"): NodeList[SVGViewElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_blockquote")
  def querySelectorAll(selectors: "blockquote"): NodeList[HTMLQuoteElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_col")
  def querySelectorAll(selectors: "col"): NodeList[HTMLTableColElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_stop")
  def querySelectorAll(selectors: "stop"): NodeList[SVGStopElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_bdi")
  def querySelectorAll(selectors: "bdi"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_clipPath")
  def querySelectorAll(selectors: "clipPath"): NodeList[SVGClipPathElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_sub")
  def querySelectorAll(selectors: "sub"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_marker")
  def querySelectorAll(selectors: "marker"): NodeList[SVGMarkerElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_menu")
  def querySelectorAll(selectors: "menu"): NodeList[HTMLMenuElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_footer")
  def querySelectorAll(selectors: "footer"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_s")
  def querySelectorAll(selectors: "s"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_cite")
  def querySelectorAll(selectors: "cite"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_b")
  def querySelectorAll(selectors: "b"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_figure")
  def querySelectorAll(selectors: "figure"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_textarea")
  def querySelectorAll(selectors: "textarea"): NodeList[HTMLTextAreaElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feTile")
  def querySelectorAll(selectors: "feTile"): NodeList[SVGFETileElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_meter")
  def querySelectorAll(selectors: "meter"): NodeList[HTMLMeterElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_dialog")
  def querySelectorAll(selectors: "dialog"): NodeList[HTMLDialogElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feMorphology")
  def querySelectorAll(selectors: "feMorphology"): NodeList[SVGFEMorphologyElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_script")
  def querySelectorAll(selectors: "script"): NodeList[HTMLScriptElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feComponentTransfer")
  def querySelectorAll(selectors: "feComponentTransfer"): NodeList[SVGFEComponentTransferElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_track")
  def querySelectorAll(selectors: "track"): NodeList[HTMLTrackElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_label")
  def querySelectorAll(selectors: "label"): NodeList[HTMLLabelElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feDistantLight")
  def querySelectorAll(selectors: "feDistantLight"): NodeList[SVGFEDistantLightElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_samp")
  def querySelectorAll(selectors: "samp"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_linearGradient")
  def querySelectorAll(selectors: "linearGradient"): NodeList[SVGLinearGradientElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_object")
  def querySelectorAll(selectors: "object"): NodeList[HTMLObjectElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_h5")
  def querySelectorAll(selectors: "h5"): NodeList[HTMLHeadingElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feFuncA")
  def querySelectorAll(selectors: "feFuncA"): NodeList[SVGFEFuncAElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_h4")
  def querySelectorAll(selectors: "h4"): NodeList[HTMLHeadingElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feGaussianBlur")
  def querySelectorAll(selectors: "feGaussianBlur"): NodeList[SVGFEGaussianBlurElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feSpecularLighting")
  def querySelectorAll(selectors: "feSpecularLighting"): NodeList[SVGFESpecularLightingElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_i")
  def querySelectorAll(selectors: "i"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_rp")
  def querySelectorAll(selectors: "rp"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_symbol")
  def querySelectorAll(selectors: "symbol"): NodeList[SVGSymbolElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_rt")
  def querySelectorAll(selectors: "rt"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_select")
  def querySelectorAll(selectors: "select"): NodeList[HTMLSelectElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_svg")
  def querySelectorAll(selectors: "svg"): NodeList[SVGSVGElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_small")
  def querySelectorAll(selectors: "small"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_td")
  def querySelectorAll(selectors: "td"): NodeList[HTMLTableDataCellElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_article")
  def querySelectorAll(selectors: "article"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_style")
  def querySelectorAll(selectors: "style"): NodeList[HTMLStyleElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_ruby")
  def querySelectorAll(selectors: "ruby"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_source")
  def querySelectorAll(selectors: "source"): NodeList[HTMLSourceElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_iframe")
  def querySelectorAll(selectors: "iframe"): NodeList[HTMLIFrameElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_frameset")
  def querySelectorAll(selectors: "frameset"): NodeList[HTMLFrameSetElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_font")
  def querySelectorAll(selectors: "font"): NodeList[HTMLFontElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_ol")
  def querySelectorAll(selectors: "ol"): NodeList[HTMLOListElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_data")
  def querySelectorAll(selectors: "data"): NodeList[HTMLDataElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feMergeNode")
  def querySelectorAll(selectors: "feMergeNode"): NodeList[SVGFEMergeNodeElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_h6")
  def querySelectorAll(selectors: "h6"): NodeList[HTMLHeadingElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_mask")
  def querySelectorAll(selectors: "mask"): NodeList[SVGMaskElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_q")
  def querySelectorAll(selectors: "q"): NodeList[HTMLQuoteElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_dfn")
  def querySelectorAll(selectors: "dfn"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_output")
  def querySelectorAll(selectors: "output"): NodeList[HTMLOutputElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_button")
  def querySelectorAll(selectors: "button"): NodeList[HTMLButtonElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_optgroup")
  def querySelectorAll(selectors: "optgroup"): NodeList[HTMLOptGroupElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_thead")
  def querySelectorAll(selectors: "thead"): NodeList[HTMLTableSectionElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_main")
  def querySelectorAll(selectors: "main"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_picture")
  def querySelectorAll(selectors: "picture"): NodeList[HTMLPictureElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_meta")
  def querySelectorAll(selectors: "meta"): NodeList[HTMLMetaElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_dd")
  def querySelectorAll(selectors: "dd"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_hr")
  def querySelectorAll(selectors: "hr"): NodeList[HTMLHRElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feBlend")
  def querySelectorAll(selectors: "feBlend"): NodeList[SVGFEBlendElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_metadata")
  def querySelectorAll(selectors: "metadata"): NodeList[SVGMetadataElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_dl")
  def querySelectorAll(selectors: "dl"): NodeList[HTMLDListElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_tbody")
  def querySelectorAll(selectors: "tbody"): NodeList[HTMLTableSectionElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_kbd")
  def querySelectorAll(selectors: "kbd"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feColorMatrix")
  def querySelectorAll(selectors: "feColorMatrix"): NodeList[SVGFEColorMatrixElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_body")
  def querySelectorAll(selectors: "body"): NodeList[HTMLBodyElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_section")
  def querySelectorAll(selectors: "section"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_foreignObject")
  def querySelectorAll(selectors: "foreignObject"): NodeList[SVGForeignObjectElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_input")
  def querySelectorAll(selectors: "input"): NodeList[HTMLInputElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_hgroup")
  def querySelectorAll(selectors: "hgroup"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_audio")
  def querySelectorAll(selectors: "audio"): NodeList[HTMLAudioElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_slot")
  def querySelectorAll(selectors: "slot"): NodeList[HTMLSlotElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_ul")
  def querySelectorAll(selectors: "ul"): NodeList[HTMLUListElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_li")
  def querySelectorAll(selectors: "li"): NodeList[HTMLLIElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_fePointLight")
  def querySelectorAll(selectors: "fePointLight"): NodeList[SVGFEPointLightElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_p")
  def querySelectorAll(selectors: "p"): NodeList[HTMLParagraphElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_span")
  def querySelectorAll(selectors: "span"): NodeList[HTMLSpanElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_del")
  def querySelectorAll(selectors: "del"): NodeList[HTMLModElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_head")
  def querySelectorAll(selectors: "head"): NodeList[HTMLHeadElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_caption")
  def querySelectorAll(selectors: "caption"): NodeList[HTMLTableCaptionElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_canvas")
  def querySelectorAll(selectors: "canvas"): NodeList[HTMLCanvasElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_nav")
  def querySelectorAll(selectors: "nav"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_dt")
  def querySelectorAll(selectors: "dt"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_strong")
  def querySelectorAll(selectors: "strong"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_sup")
  def querySelectorAll(selectors: "sup"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_switch")
  def querySelectorAll(selectors: "switch"): NodeList[SVGSwitchElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feDisplacementMap")
  def querySelectorAll(selectors: "feDisplacementMap"): NodeList[SVGFEDisplacementMapElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feFuncB")
  def querySelectorAll(selectors: "feFuncB"): NodeList[SVGFEFuncBElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_var")
  def querySelectorAll(selectors: "var"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_pre")
  def querySelectorAll(selectors: "pre"): NodeList[HTMLPreElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_summary")
  def querySelectorAll(selectors: "summary"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_base")
  def querySelectorAll(selectors: "base"): NodeList[HTMLBaseElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feComposite")
  def querySelectorAll(selectors: "feComposite"): NodeList[SVGFECompositeElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feFuncR")
  def querySelectorAll(selectors: "feFuncR"): NodeList[SVGFEFuncRElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_line")
  def querySelectorAll(selectors: "line"): NodeList[SVGLineElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_table")
  def querySelectorAll(selectors: "table"): NodeList[HTMLTableElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feOffset")
  def querySelectorAll(selectors: "feOffset"): NodeList[SVGFEOffsetElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_image")
  def querySelectorAll(selectors: "image"): NodeList[SVGImageElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_bdo")
  def querySelectorAll(selectors: "bdo"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feSpotLight")
  def querySelectorAll(selectors: "feSpotLight"): NodeList[SVGFESpotLightElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_datalist")
  def querySelectorAll(selectors: "datalist"): NodeList[HTMLDataListElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_aside")
  def querySelectorAll(selectors: "aside"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_textPath")
  def querySelectorAll(selectors: "textPath"): NodeList[SVGTextPathElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_abbr")
  def querySelectorAll(selectors: "abbr"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_h3")
  def querySelectorAll(selectors: "h3"): NodeList[HTMLHeadingElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_title")
  def querySelectorAll(selectors: "title"): NodeList[HTMLTitleElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feConvolveMatrix")
  def querySelectorAll(selectors: "feConvolveMatrix"): NodeList[SVGFEConvolveMatrixElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_tfoot")
  def querySelectorAll(selectors: "tfoot"): NodeList[HTMLTableSectionElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_use")
  def querySelectorAll(selectors: "use"): NodeList[SVGUseElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_fieldset")
  def querySelectorAll(selectors: "fieldset"): NodeList[HTMLFieldSetElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_mark")
  def querySelectorAll(selectors: "mark"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_param")
  def querySelectorAll(selectors: "param"): NodeList[HTMLParamElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_tr")
  def querySelectorAll(selectors: "tr"): NodeList[HTMLTableRowElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_option")
  def querySelectorAll(selectors: "option"): NodeList[HTMLOptionElement & org.scalajs.dom.Node] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_code")
  def querySelectorAll(selectors: "code"): NodeList[org.scalajs.dom.HTMLElement & org.scalajs.dom.Node] = js.native
  /* standard dom */
  def querySelectorAll[E /* <: org.scalajs.dom.Element */](selectors: java.lang.String): NodeList[E & org.scalajs.dom.Node] = js.native
}
