package org.springframework.social.partnercenter.api.customer.response;

import java.util.List;
import java.util.Map;

import org.springframework.social.partnercenter.api.Link;
import org.springframework.social.partnercenter.api.customer.BillingProfile;
import org.springframework.social.partnercenter.api.customer.CompanyProfile;

	public class GetCompanyProfileResponse {
	private String id;
	private String commerceId;
	private CompanyProfile companyProfile;
	private BillingProfile billingProfile;
	private String relationshipToPartner;
	private boolean allowDelegatedAccess;
	private List<String> customDomains;
	private Map<String, Link> links;
	private Map<String, String> attributes;

	public String getId() {
		return id;
	}

	public GetCompanyProfileResponse setId(String id) {
		this.id = id;
		return this;
	}

	public String getCommerceId() {
		return commerceId;
	}

	public GetCompanyProfileResponse setCommerceId(String commerceId) {
		this.commerceId = commerceId;
		return this;
	}

	public CompanyProfile getCompanyProfile() {
		return companyProfile;
	}

	public GetCompanyProfileResponse setCompanyProfile(CompanyProfile companyProfile) {
		this.companyProfile = companyProfile;
		return this;
	}

	public BillingProfile getBillingProfile() {
		return billingProfile;
	}

	public GetCompanyProfileResponse setBillingProfile(BillingProfile billingProfile) {
		this.billingProfile = billingProfile;
		return this;
	}

	public String getRelationshipToPartner() {
		return relationshipToPartner;
	}

	public GetCompanyProfileResponse setRelationshipToPartner(String relationshipToPartner) {
		this.relationshipToPartner = relationshipToPartner;
		return this;
	}

	public boolean isAllowDelegatedAccess() {
		return allowDelegatedAccess;
	}

	public GetCompanyProfileResponse setAllowDelegatedAccess(boolean allowDelegatedAccess) {
		this.allowDelegatedAccess = allowDelegatedAccess;
		return this;
	}

	public List<String> getCustomDomains() {
		return customDomains;
	}

	public GetCompanyProfileResponse setCustomDomains(List<String> customDomains) {
		this.customDomains = customDomains;
		return this;
	}

	public Map<String, Link> getLinks() {
		return links;
	}

	public GetCompanyProfileResponse setLinks(Map<String, Link> links) {
		this.links = links;
		return this;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public GetCompanyProfileResponse setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
		return this;
	}
}
